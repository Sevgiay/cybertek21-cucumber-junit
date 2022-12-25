package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",                //ozellik kilasi .GoogleSearch.feature calistirmak istiyorsam / atip devamina yazarim
        glue = "com/cybertek/step_definitions",                 //burda sources kullandik cunku diger turlu src den itibaren gelecek ben sadece bu kaynnaga bakmak istiyorum.glu neden kullaniyoruz nerde oldugunu konumlandirmak icin
        dryRun = false,                                      //buraya true yazdigimiz zaman direk sonucu ogrenmek icin passs yada fail ekrana baska hicbirsey gelmiyorr
        tags = "@librarian or @student or @admin"


)

public class CukesRunner {

}
