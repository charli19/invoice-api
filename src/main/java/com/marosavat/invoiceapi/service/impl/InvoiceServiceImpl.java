package com.marosavat.invoiceapi.service.impl;

import com.marosavat.invoiceapi.model.Invoice;
import com.marosavat.invoiceapi.service.InvoiceService;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private TopicExchange topicExchange;

    @Override
    public void sendInvoice(Invoice invoice) {
        rabbitTemplate.convertAndSend(topicExchange.getName(), "invoice.key", invoice);
    }

}
