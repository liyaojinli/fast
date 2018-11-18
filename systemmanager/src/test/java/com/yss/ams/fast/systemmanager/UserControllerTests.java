package com.yss.ams.fast.systemmanager;

import com.yss.ams.fast.framework.test.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SystemManagerApplication.class})
public class UserControllerTests extends BaseTest {

    @Test
    public void test_UserController_FindByName() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.get("/systemmanager/user/find/{name}", "李尧锦")
                .characterEncoding("utf-8")).andReturn();
        Assert.assertEquals(result.getResponse().getStatus(),200);
        Assert.assertEquals(result.getModelAndView().getViewName(),"userList");
        Assert.assertNotNull(result.getModelAndView().getModel().get("users"));
    }
}
