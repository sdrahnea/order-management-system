package com.oms.controller;

import com.oms.model.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/message")
public class MessageController extends AbstractController<Message> {
}