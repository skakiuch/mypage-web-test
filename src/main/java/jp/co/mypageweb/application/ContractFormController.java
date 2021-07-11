package jp.co.mypageweb.application;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
@Slf4j
public class ContractFormController {

    private static final String CONTACT_FORM_URI = "/contact/form";

    @GetMapping(value = CONTACT_FORM_URI)
    public String form() {

        return "contact/index";
    }

}
