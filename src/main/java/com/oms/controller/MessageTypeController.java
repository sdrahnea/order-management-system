package com.oms.controller;

import com.oms.model.MessageType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/message-type")
public class MessageTypeController extends AbstractController<MessageType> {
}