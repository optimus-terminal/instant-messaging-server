package org.fyp24064.model.dto;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateChatRoomDTO {
    private String roomTitle;
    private List<String> members;
}
