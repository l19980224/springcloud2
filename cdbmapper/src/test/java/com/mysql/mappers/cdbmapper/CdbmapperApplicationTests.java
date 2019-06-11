package com.mysql.mappers.cdbmapper;

import com.mysql.mappers.cdbmapper.beans.CabinetInfo;
import com.mysql.mappers.cdbmapper.dao.CabinetInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CdbmapperApplication.class)
@Transactional
@Rollback
public class CdbmapperApplicationTests {

    @Autowired
    private CabinetInfoMapper cm;

    @Test
    public void alllist() {
        List<CabinetInfo> CMlist = cm.selectAll();
        for (CabinetInfo cml : CMlist) {
            System.out.println(cml.getId());
        }

    }
}
