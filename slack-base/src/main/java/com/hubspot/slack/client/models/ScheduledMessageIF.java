package com.hubspot.slack.client.models;

import org.immutables.value.Value.Immutable;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hubspot.immutables.style.HubSpotStyle;

@Immutable
@HubSpotStyle
@JsonNaming(SnakeCaseStrategy.class)
public interface ScheduledMessageIF {
  String getId();

  String getChannelId();

  long getPostAt();

  long getDateCreated();

  String getText();
}
