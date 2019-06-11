package com.layui.ctrls;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mysql.mappers.cdbmapper.beans.*;
import com.mysql.mappers.cdbmapper.dao.*;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tk.mybatis.mapper.entity.Example;


import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class Ctrl {

    private static final Logger logger = LoggerFactory.getLogger(Ctrl.class);
//    机柜管理表
    @Autowired
    private CabinetInfoMapper cm;
//    代理表
    @Autowired
    private AgentInfoMapper am;
//    充电宝表
    @Autowired
    private PowerBankInfoMapper pb;
//    用户表
    @Autowired
    private UserInfoMapper um;
//    用户权限表
    @Autowired
    private PathTestMapper ptm;
//    用户信息表
    @Autowired
    private AcntInfoMapper acntInfo;
//    提现记录表
    @Autowired
    private WithdrawMapper withdrawMapper;


//    动态菜单栏
    @RequestMapping("/iframedemo")
    public String index(String username , Model md) {
        System.out.println(username);
        int role = 2;
        String userlogo = "/jpg/Qsaber.png";
        if (username.equals("admin")){
            role = 0;
            userlogo = "/jpg/saber1.jpeg";
        }else if (username.equals("wc")){
            role = 1;
            userlogo = "/jpg/saber2.png";
        }

        Example pathTestExp = new Example(PathTest.class);
        Example.Criteria expCriteria = pathTestExp.createCriteria();

        expCriteria.andGreaterThanOrEqualTo("role",role);
        expCriteria.andLike("parentpathid","0");

        List<PathTest> menus = ptm.selectByExample(pathTestExp);
        md.addAttribute("username",username);
        md.addAttribute("userlogo",userlogo);
        md.addAttribute("menus",menus);
        return "iframedemo";
    }

    @ResponseBody
    @RequestMapping("menuinfo")
    public List<PathTest> menuinfo(String parentpathid){

        PathTest exp = new PathTest();
        exp.setParentpathid(Integer.parseInt(parentpathid));
        List<PathTest> datas = ptm.select(exp);
        return datas;
    }

//  登陆模块
    @ResponseBody
    @RequestMapping("/login")
    public int login1(String user , String pwd) {
        logger.info("登陆账户：{} 密码：{}",user,pwd);
        if (user.equals("admin")&&pwd.equals("123456")){
            return 1;
        }else if (user.equals("wc")&&pwd.equals("123456")){
            return 1;
        }
            return 0;
    }
    @RequestMapping("/")
    public String login() {
        return "login";
    }

//机柜管理页面
    @RequestMapping("/cabinet")
    public String cabinetinfo() {
        return "tables/cabinet";
    }
//充电宝管理页面
    @RequestMapping("/power_bank_info")
    public String index2() {
        return "tables/power_bank_info";
    }
//代理管理页面
    @RequestMapping("/agent_info")
    public String index3() {
        return "tables/agent_info";
    }
//账户资金明细
    @RequestMapping("/acntinfo")
    public String acntinfohtml() {
        return "tables/acntinfo";
    }
//账户资金明细
    @RequestMapping("/withdraw")
    public String withdraw() {
        return "tables/withdraw";
    }


    //, produces = { "application/json;charset=UTF-8" }
//    查询全部
    @RequestMapping(value = "test")
    @ResponseBody
    public String testselect(int page, int limit) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        PageHelper.startPage(page, limit);
        Example example = new Example(CabinetInfo.class);
        PageInfo<CabinetInfo> pageInfo = new PageInfo<>(cm.selectByExample(example));
        List<CabinetInfo> bean1 = pageInfo.getList();

//      日期转换笔记
//        List<CabinetInfo2> bean2 = new ArrayList<>();
//        for (int x=0;x<limit;x++){
//            CabinetInfo2 ci2=new CabinetInfo2();
//            ci2.setAvailableCount(bean1.get(x).getAvailableCount());
//            String y = sdf.format(bean1.get(x).getCreatedTime());
//            System.out.println("************"+y);
//            ci2.setCreatedTime(y);
//            bean2.add(ci2);
//        }


        JSONObject jobj = new JSONObject();
        jobj.put("code", 0);
        jobj.put("msg", "");
        jobj.put("count", cm.selectCount(new CabinetInfo()));
        jobj.put("data", bean1);
        return jobj.toString();
    }

//      数据笔记
//    @RequestMapping(value = "/getall")
//    @ResponseBody
//    public String getAll1(int page,int limit){
//
//        PageHelper.startPage(page,limit);
//        Example example = new Example(CabinetInfo.class);
//        PageInfo<CabinetInfo> pageInfo = new PageInfo<>(cm.selectByExample(example));
//        List<CabinetInfo> bean1 = pageInfo.getList();
//        CabinetInfo cb = new CabinetInfo();
//
//        int count = cm.selectCount(cb);
//
//        JSONArray json = new JSONArray();
//        //将集合变为json
//        for (CabinetInfo u: bean1) {
//            JSONObject jo = new JSONObject();
//            jo.put("ID",u.getId());
//
//            json.add(jo);
//        }
//        //将数据准备好layUI的格式
//        JSONObject jobj = new JSONObject();
//        jobj.put("code",0);
//        jobj.put("msg","");
//        jobj.put("count",count);
//        jobj.put("data",json);
//        System.out.println(jobj.toString());
//        return jobj.toString();
//    }

    //    条件查询
    @ResponseBody
    @RequestMapping("/testselect")
    public String testselectbyexp(int page, int limit, String cabinetNo, String status, String useStatus) {

        PageHelper.startPage(page, limit);
        Example example = new Example(CabinetInfo.class);
        example.createCriteria().andLike("cabinetNo", "%" + cabinetNo + "%");    //序列号
        example.createCriteria().andLike("status", "%" + status + "%");          //绑定状态
        example.createCriteria().andLike("useStatus", "%" + useStatus + "%");    //使用状态

        //testselect?page=1&limit=10&cabinetNo=
        List<CabinetInfo> list = cm.selectByExample(example);
        PageInfo<CabinetInfo> pageInfo = new PageInfo<>(list);
        List<CabinetInfo> bean1 = pageInfo.getList();

        JSONObject jobj = new JSONObject();
        jobj.put("code", 0);
        jobj.put("msg", "");
        jobj.put("count", cm.selectCountByExample(example));
        jobj.put("data", bean1);
        return jobj.toString();
    }


    //    修改
    @ResponseBody
    @RequestMapping("/testchange")
    public int testselectbyexp(String id,String cabinetNo,String powerCount) {
//        /testchange?id=2307&powerCount=5
//        System.out.println(id+"******"+powerCount);
        CabinetInfo cb = new CabinetInfo();
        cb.setId(Integer.parseInt(id));

        cb.setCabinetNo(cabinetNo);
        cb.setPowerCount(Integer.parseInt(powerCount));

        return cm.updateByPrimaryKeySelective(cb);
    }


//    @RequestMapping("/lay1")
//    public String laybase1(String id, String cabinetNo,String powerCount,Model md){
//        CabinetInfo cb = new CabinetInfo();
//        cb.setId(Integer.parseInt(id));
//        cb.setCabinetNo(cabinetNo);
//        cb.setPowerCount(Integer.parseInt(powerCount));
//        md.addAttribute("bean",cb);
//        return "laybase1";
//    }

//    文件上传
    @ResponseBody
    @RequestMapping(value = "uploadtest",method = RequestMethod.POST)
    public JSONObject uploadImage(@RequestParam("file") MultipartFile file) {
        JSONObject resObj = new JSONObject();

        String FilePath = "D:\\AHG\\";
        String FileName = file.getOriginalFilename();
        if (!file.isEmpty()) {
            try {
                BufferedOutputStream out =
                        new BufferedOutputStream(
                                        new FileOutputStream(
                                                new File(FilePath, FileName)
                                        )
                                );
                out.write(file.getBytes());
                out.flush();
                out.close();
            } catch (IOException e) {
                resObj.put("msg", "error");
                resObj.put("code", "1");
                resObj.put("data",FileName);
                return resObj;
            }
            int flag = jsoninsert(FilePath+FileName);
            resObj.put("msg", String.valueOf(flag));
            resObj.put("code", "0");
            resObj.put("data",FileName);
            return resObj;
        }
        resObj.put("msg", "请更换文件名");
        resObj.put("code", "0");
        resObj.put("data",FileName);
        return resObj;
    }
    // Json文件导入数据
    public int jsoninsert(String FilePath) {
        List<CabinetInfo> cabinetInfos = new ArrayList<>();

        JsonParser parser = new JsonParser(); // 创建JSON解析器

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            FileReader fReader = new FileReader(FilePath);
            JsonObject object = (JsonObject) parser.parse(fReader);  //创建JsonObject对象
            // 创建JsonObject对象
            JsonArray array = object.get("data").getAsJsonArray(); // 得到为json的数组
            for (int i = 0; i < array.size(); i++) {
                CabinetInfo cbinfolist = new CabinetInfo();
                JsonObject subObject = array.get(i).getAsJsonObject();
                // 将json数据转为为String型的数据
                cbinfolist.setId(subObject.get("id").getAsInt());
                cbinfolist.setCabinetNo(subObject.get("cabinetNo").getAsString());
                cbinfolist.setCabinetQrcode(subObject.get("cabinetQrcode").getAsString());
                cbinfolist.setStatus(subObject.get("status").getAsString());
                cbinfolist.setUseStatus(subObject.get("useStatus").getAsString());
                cbinfolist.setAvailableCount(subObject.get("availableCount").getAsInt());
                cbinfolist.setPowerCount(subObject.get("powerCount").getAsInt());
                cbinfolist.setUserId(subObject.get("userId").getAsString());
                cbinfolist.setPlatformId(subObject.get("platformId").getAsString());
                cbinfolist.setCreatedTime(sdf.parse(subObject.get("createdTime").getAsString()));
                cbinfolist.setUpdatedBy(subObject.get("updatedBy").getAsString());
                cbinfolist.setUpdatedTime(sdf.parse(subObject.get("updatedTime").getAsString()));
                cbinfolist.setBusinessId(subObject.get("businessId").getAsString());
                cbinfolist.setRentHours(subObject.get("rentHours").getAsBigDecimal());
                cbinfolist.setMaxRent(subObject.get("maxRent").getAsBigDecimal());
                cabinetInfos.add(cbinfolist);
            }
            fReader.close();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        File file = new File(FilePath);
        if (file.exists() && file.isFile()) {
            if (file.delete()) {
                System.out.println("删除成功！");

            } else {
                System.out.println("删除失败！");
            }
        } else {
            System.out.println("删除文件不存在！");
        }
        return cm.insertList(cabinetInfos);
    }

    // ***************** power_bank_info ctrl开始！************************************
    //    查询全部
    @RequestMapping(value = "powerbankinfo")
    @ResponseBody
    public String powerbankinfo(int page, int limit) {

        PageHelper.startPage(page, limit);
        Example example = new Example(PowerBankInfo.class);
        PageInfo<PowerBankInfo> pageInfo = new PageInfo<>(pb.selectByExample(example));
        List<PowerBankInfo> bean1 = pageInfo.getList();

        JSONObject jobj = new JSONObject();
        jobj.put("code", 0);
        jobj.put("msg", "");
        jobj.put("count", pb.selectCount(new PowerBankInfo()));
        jobj.put("data", bean1);
        return jobj.toString();
    }


    //    修改
    @ResponseBody
    @RequestMapping("/pbonchange")
    public int pbonchange(String id,String powerBankNo) {
//        /testchange?id=2307&powerCount=5
//        System.out.println(id+"******"+powerCount);
        PowerBankInfo cb = new PowerBankInfo();

        cb.setId(Integer.parseInt(id));
        cb.setPowerBankNo(powerBankNo);

        return pb.updateByPrimaryKeySelective(cb);
    }

    //    条件查询
    @ResponseBody
    @RequestMapping("/pbinfoselect")
    public String pbinfoselect(int page, int limit, String powerBankNo, String status, String createTime) {

        System.out.println(powerBankNo);
        PageHelper.startPage(page, limit);
        Example example = new Example(PowerBankInfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike( "powerBankNo", "%"+ powerBankNo + "%");    //序列号
        criteria.andLike("status", status + "%");          //状态
        criteria.andLike("createTime", createTime + "%");    //日期
        List<PowerBankInfo> list = pb.selectByExample(example);

        PageInfo<PowerBankInfo> pageInfo = new PageInfo<>(list);
        List<PowerBankInfo> bean1 = pageInfo.getList();

        JSONObject jobj = new JSONObject();
        jobj.put("code", 0);
        jobj.put("msg", "");
        jobj.put("count", pb.selectCountByExample(example));
        jobj.put("data", bean1);
        return jobj.toString();
    }

    // 条件删除
    @ResponseBody
    @RequestMapping("/pbondel")
    public int pbondel(String id) {
        PowerBankInfo cb = new PowerBankInfo();
        cb.setId(Integer.parseInt(id));
        return pb.deleteByPrimaryKey(cb);
    }

    // 添加充电宝信息
    @ResponseBody
    @RequestMapping("/pbadd")
    public int pbadd(String powerBankNo) {
        System.out.println(powerBankNo);
        PowerBankInfo cb = new PowerBankInfo();
        cb.setPowerBankNo(powerBankNo);
        cb.setCreateTime(new Date());
        cb.setStatus("1");
        return pb.insertSelective(cb);
    }

    // ***************** agentinfo ctrl开始！************************************
    //    查询全部
    @RequestMapping(value = "agentinfo")
    @ResponseBody
    public String agentinfo(int page, int limit) {

        PageHelper.startPage(page, limit);
        Example example = new Example(AgentInfo.class);
        PageInfo<AgentInfo> pageInfo = new PageInfo<>(am.selectByExample(example));
        List<AgentInfo> bean1 = pageInfo.getList();

        JSONObject jobj = new JSONObject();
        jobj.put("code", 0);
        jobj.put("msg", "");
        jobj.put("count", am.selectCount(new AgentInfo()));
        jobj.put("data", bean1);
        return jobj.toString();
    }

    //    条件查询
    @ResponseBody
    @RequestMapping("/agentinfoselect")
    public String agentinfoselect(int page, int limit, String agentName, String phone, String type) {

        System.out.println(agentName);
        PageHelper.startPage(page, limit);
        Example example = new Example(AgentInfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("agentName",  "%"+agentName + "%");
        criteria.andLike("phone", "%" + phone + "%");
        if (!type.equals("")){
            criteria.andLike("type", type);
        }
        List<AgentInfo> list = am.selectByExample(example);

        PageInfo<AgentInfo> pageInfo = new PageInfo<>(list);
        List<AgentInfo> bean1 = pageInfo.getList();

        JSONObject jobj = new JSONObject();
        jobj.put("code", 0);
        jobj.put("msg", "");
        jobj.put("count", am.selectCountByExample(example));
        jobj.put("data", bean1);
        return jobj.toString();
    }

    //    修改
    @ResponseBody
    @RequestMapping("/agentchange")
    public int agentchange(String agentName,String phone,String proportion ,String agentNo) {
        AgentInfo cb = new AgentInfo();
        cb.setAgentName(agentName);
        cb.setPhone(phone);
        cb.setProportion(proportion);
        cb.setAgentNo(agentNo);
        return am.updateByPrimaryKeySelective(cb);
    }
    // 条件删除
    @ResponseBody
    @RequestMapping("/agentdel")
    public int agentdel(String agentNo) {
        AgentInfo cb = new AgentInfo();
        cb.setAgentNo(agentNo);
        return am.deleteByPrimaryKey(cb);
    }
    // 添加充电宝信息
    @ResponseBody
    @RequestMapping("/agentadd")
    public int agentadd(String agentName,String phone,String proportion ) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
        Date date = new Date();

        AgentInfo cb = new AgentInfo();
        cb.setAgentName(agentName);
        cb.setPhone(phone);
        cb.setProportion(proportion);
        cb.setType("1");
        cb.setAgentNo(sdf.format(date));
        return am.insertSelective(cb);
    }
    // ***************** agentinfo ctrl开始！************************************
    //    查询全部
    @RequestMapping(value = "userinfo")
    @ResponseBody
    public String userinfo(int page, int limit) {

        PageHelper.startPage(page, limit);
        Example example = new Example(UserInfo.class);
        PageInfo<UserInfo> pageInfo = new PageInfo<>(um.selectByExample(example));
        List<UserInfo> bean1 = pageInfo.getList();

        JSONObject jobj = new JSONObject();
        jobj.put("code", 0);
        jobj.put("msg", "");
        jobj.put("count", um.selectCount(new UserInfo()));
        jobj.put("data", bean1);
        return jobj.toString();
    }


    // ***************** acntinfo ctrl开始！************************************
    //    查询全部
    @RequestMapping("/acntinfoall")
    @ResponseBody
    public String acntinfoall(int page, int limit) {

        PageHelper.startPage(page, limit);
        Example example = new Example(AcntInfo.class);
        PageInfo<AcntInfo> pageInfo = new PageInfo<>(acntInfo.selectByExample(example));
        List<AcntInfo> bean1 = pageInfo.getList();

        JSONObject jobj = new JSONObject();
        jobj.put("code", 0);
        jobj.put("msg", "");
        jobj.put("count", acntInfo.selectCount(new AcntInfo()));
        jobj.put("data", bean1);
        return jobj.toString();
    }
    //    条件查询
    @ResponseBody
    @RequestMapping("/acntinfoselect")
    public String acntinfoselect(int page, int limit, String acntno, String acntname, String mobileno) {
        System.out.println(acntno);
        PageHelper.startPage(page, limit);
        Example example = new Example(AcntInfo.class);
        Example.Criteria criteria = example.createCriteria();

        criteria.andLike("acntNo", "%"+ acntno + "%");       //用户号码
        criteria.andLike("acntName","%" +acntname + "%");    //用户名
        criteria.andLike("mobileNo", mobileno + "%");    //电话号码

        List<AcntInfo> list = acntInfo.selectByExample(example);

        PageInfo<AcntInfo> pageInfo = new PageInfo<>(list);
        List<AcntInfo> bean1 = pageInfo.getList();

        JSONObject jobj = new JSONObject();
        jobj.put("code", 0);
        jobj.put("msg", "");
        jobj.put("count", acntInfo.selectCountByExample(example));
        jobj.put("data", bean1);
        return jobj.toString();
    }

    // ***************** withdraw ctrl开始！************************************
    //    查询全部
    @RequestMapping("/withdrawall")
    @ResponseBody
    public String withdrawall(int page, int limit) {

        PageHelper.startPage(page, limit);
        Example example = new Example(Withdraw.class);
        Example.Criteria criteria = example.createCriteria();

        criteria.andLike("type","1");

        PageInfo<Withdraw> pageInfo = new PageInfo<>(withdrawMapper.selectByExample(example));
        List<Withdraw> bean1 = pageInfo.getList();

        JSONObject jobj = new JSONObject();
        jobj.put("code", 0);
        jobj.put("msg", "");
        jobj.put("count", withdrawMapper.selectCountByExample(example));
        jobj.put("data", bean1);
        return jobj.toString();
    }
    //    条件查询
    @ResponseBody
    @RequestMapping("/withdrawselect")
    public String withdrawselect(int page, int limit, String accountName) {
        System.out.println(accountName);

        PageHelper.startPage(page, limit);
        Example example = new Example(Withdraw.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("accountName","%" +accountName + "%");    //用户名
        List<Withdraw> list = withdrawMapper.selectByExample(example);
        PageInfo<Withdraw> pageInfo = new PageInfo<>(list);
        List<Withdraw> bean1 = pageInfo.getList();
        JSONObject jobj = new JSONObject();
        jobj.put("code", 0);
        jobj.put("msg", "");
        jobj.put("count", withdrawMapper.selectCountByExample(example));
        jobj.put("data", bean1);
        return jobj.toString();
    }
}
