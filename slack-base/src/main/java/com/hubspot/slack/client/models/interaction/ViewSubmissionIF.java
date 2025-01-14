package com.hubspot.slack.client.models.interaction;

import javax.annotation.Nullable;

import org.immutables.value.Value.Immutable;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hubspot.immutables.style.HubSpotStyle;
import com.hubspot.slack.client.models.SlackChannel;

@Immutable
@HubSpotStyle
@JsonNaming(SnakeCaseStrategy.class)
public interface ViewSubmissionIF extends SlackInteractiveCallback {

  ViewInteractionPayload getView();

  @Override
  @Nullable String getCallbackId();

  @Override
  default SlackChannel getChannel() {
    return null;
  }

  @Override
  default String getActionTs() {
    return null;
  }

}
