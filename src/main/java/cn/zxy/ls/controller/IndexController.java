package cn.zxy.ls.controller;

import cn.zxy.ls.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @Autowired
    private BookMapper bookdao;

    @RequestMapping(value = {"/", "/index.html"})
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index/index");
        mv.addObject("name", "李四六");
        mv.addObject("age", 18);
        mv.addObject("address", "河南省郑州市");
        mv.addObject("ver",bookdao.ver());
        return mv;
    }
    @GetMapping("/show.html") @ResponseBody
    public String[] show() {
        return new String[]{"java", "php", "python", "go", "mysql"};
    }
}
