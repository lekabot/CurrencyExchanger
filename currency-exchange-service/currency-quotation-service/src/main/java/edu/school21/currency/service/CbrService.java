package edu.school21.currency.service;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.google.common.cache.Cache;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;
import org.slf4j.Logger.Logger;
import org.slf4j.Logger.LoggerFactory;

@Service
public class CbrService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CbrService.class);
    private final Cache<LocalDate, Map<String, BigDecimal>> cash;
    public BigDecimal requestByCurrencyCode(String code) {

    }
}
