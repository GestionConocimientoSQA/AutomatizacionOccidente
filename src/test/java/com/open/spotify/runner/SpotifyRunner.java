package com.open.spotify.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feautres/spotify/LoginSpotifyStepDefinitions.feature",
        glue = "src/test/java/com/open/spotify",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class SpotifyRunner {
}
