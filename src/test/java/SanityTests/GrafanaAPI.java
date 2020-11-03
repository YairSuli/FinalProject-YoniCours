package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.ApiFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class GrafanaAPI extends CommonOps {

//    @Test(description = "Test01: Get Team From Grafana")
//    @Description("Test Description: Login to Grafana and Get Team")
//    public void test01_GetTeam() {
//        Verifications.text(ApiFlows.getTeamProperty("teams[0].name"), "YoniTeam");
//    }

    @Test(description = "Test01: Add Team and Verify it")
    @Description("Test Description: Add Team to Grafana and Verify it")
    public void test01_addTeamAndVerify() {
        ApiFlows.postTeam("YoniTeam1", "Yoni@Team1.com");
        Verifications.text(ApiFlows.getTeamProperty("teams[0].name"), "YoniTeam1");
    }

    @Test(description = "Test02: Update Team and Verify it")
    @Description("Test Description: Update Team in Grafana and Verify it")
    public void test02_updateTeamAndVerify() {
        ApiFlows.updateTeam("MyTeam", "Yoni@Team1.com","1");
        Verifications.text(ApiFlows.getTeamProperty("teams[0].name"), "MyTeam");
    }

    @Test(description = "Test03: Delete Team and Verify it")
    @Description("Test Description: Delete Team in Grafana and Verify it")
    public void test03_deleteTeamAndVerify() {
        ApiFlows.deleteTeam("1");
        Verifications.text(ApiFlows.getTeamProperty("totalCount"), "0");
    }
}
