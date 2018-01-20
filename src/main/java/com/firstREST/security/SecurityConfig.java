package com.firstREST.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers(
                        //A股信息表
                        "/jlzx/JL_BASE_1101/*",
                        "/jlzx/JL_BASE_1102/*",
                        "/jlzx/JL_BASE_New_2001/*",
                        "/jlzx/JL_BASE_2003/*",
                        "/jlzx/JL_BASE_2006/*",
                        "/jlzx/JL_BASE_2008/*",
                        "/jlzx/JL_BASE_2009/*",
                        "/jlzx/JL_BASE_2010/*",
                        "/jlzx/JL_BASE_2011/*",
                        "/jlzx/JL_BASE_2014/*",
                        "/jlzx/JL_BASE_2015/*",
                        "/jlzx/JL_BASE_2016/*",
                        "/jlzx/JL_BASE_2107/*",
                        "/jlzx/JL_BASE_2108/*",
                        "/jlzx/JL_BASE_2109/*",
                        "/jlzx/JL_BASE_2111/*",
                        "/jlzx/jl_ext_3001/*",
                        "/jlzx/jl_ext_3005/*",
                        "/jlzx/JL_EXT_3006/*",
                        "/jlzx/JL_EXT_3003_local/*",
                        "/jlzx/JL_EXT_3002_local_zq/*",
                        "/jlzx/JL_EXT_4001/*",
                        "/jlzx/JL_EXT_4002/*",
                        "/jlzx/JL_EXT_4003/*",
                        "/jlzx/JL_BASE_3504/*",
                        "/jlzx/JL_BASE_3502/*",
                        "/jlzx/JL_BASE_3503/*",
                        "/jlzx/JL_DATA_3201/*",
                        "/jlzx/JL_DATA_3202/*",
                        "/jlzx/JL_DATA_3203/*",
                        "/jlzx/JL_BASE_9101/*",
                        "/jlzx/JL_BASE_9102/*",
                        "/jlzx/JL_BASE_9103/*",

                        //港股信息表
                        "/jlzx/hk_main/*",
                        "/jlzx/hk_security/*",
                        "/jlzx/hk_gbjg/*",
                        "/jlzx/hk_hbst/*",
                        "/jlzx/hk_hdiv/*",
                        "/jlzx/hk_hstk1/*",
                        "/jlzx/hk_lspecialnotice/*",
                        "/jlzx/hk_ShareIPO/*",
                        "/jlzx/hk_lannouncement/*",
                        "/jlzx/hk_lannouncement_nr/*",
                        "/jlzx/hk_news/*",
                        "/jlzx/hk_news_rela/*",
                        "/jlzx/hk_daydata/*",
                        "/jlzx/hk_company_1006/*",
                        "/jlzx/hk_company_1007/*",
                        "/jlzx/hk_balancesheet/*",
                        "/jlzx/hk_cashflowstatement/*",
                        "/jlzx/hk_incomestatement/*",
                        "/jlzx/hk_jr_balancesheet/*",
                        "/jlzx/hk_jr_cashflowstatement/*",
                        "/jlzx/hk_jr_incomestatement/*",
                        "/jlzx/hk_bx_balancesheet/*",
                        "/jlzx/hk_bx_cashflowstatement/*",
                        "/jlzx/hk_bx_incomestatement/*",
                        "/jlzx/hk_tz_balancesheet/*",
                        "/jlzx/hk_tz_cashflowstatement/*",
                        "/jlzx/hk_tz_incomestatement/*",
                        "/jlzx/hk_cwbl/*",
                        "/jlzx/hk_cwbl2/*",

                        //美股信息表
                        "/jlzx/ccs_company/*",
                        "/jlzx/ccs_stock/*",
                        "/jlzx/ccs_issue/*",
                        "/jlzx/ccs_hbst/*",
                        "/jlzx/ccs_gbjg/*",
                        "/jlzx/ccs_dividend/*",
                        "/jlzx/ccs_plate/*",
                        "/jlzx/ccs_codeplate/*",
                        "/jlzx/ccs_senior/*",
                        "/jlzx/ccs_incomestatement/*",
                        "/jlzx/css_balancesheet/*",
                        "/jlzx/ccs_cashflowstatement/*",
                        "/jlzx/ccs_Quotation/*",
                        "/jlzx/ccs_AnticipatedShareQuotation/*",
                        "/jlzx/ccs_Announcement/*",
                        "/jlzx/ccs_News/*",
                        "/jlzx/ccs_NewsRela/*",
                        "/jlzx/ccs_report/*").permitAll()
                .anyRequest().denyAll();
    }
}
