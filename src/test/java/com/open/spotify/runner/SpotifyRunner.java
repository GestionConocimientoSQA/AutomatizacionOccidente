package com.open.spotify.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feautres/spotify/LoginSpotify.feature",
        glue = "com.open.spotify.stepDefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class SpotifyRunner {


}
