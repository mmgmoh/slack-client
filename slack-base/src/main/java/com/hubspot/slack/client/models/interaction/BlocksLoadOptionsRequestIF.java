package com.hubspot.slack.client.models.interaction;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hubspot.immutables.style.HubSpotStyle;
import com.hubspot.slack.client.models.response.views.ViewResponseBase;
import com.hubspot.slack.client.models.teams.SlackTeam;
import com.hubspot.slack.client.models.users.SlackUser;
import com.hubspot.slack.client.models.users.SlackUserLite;
import org.immutables.value.Value.Immutable;

import java.util.Optional;

@Immutable
@HubSpotStyle
@JsonNaming(SnakeCaseStrategy.class)
public interface BlocksLoadOptionsRequestIF {
  String getType();
  SlackUserLite getUser();
  SlackTeam getTeam();
  String getToken();
  String getActionId();
  String getBlockId();
  String getValue();

  Container getContainer();

  Optional<ViewResponseBase> getView();
}
