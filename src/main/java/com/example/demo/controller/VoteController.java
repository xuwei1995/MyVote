package com.example.demo.controller;

import com.example.demo.domain.*;
import com.example.demo.mapper.VoteOptionMapper;
import com.example.demo.mapper.VoteRecordMapper;
import com.example.demo.service.VoteService;
import com.example.demo.util.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class VoteController {
    @Autowired
    private VoteService voteService;

    @RequestMapping("index")
    public String index(HttpSession session,Model model){
        try {
            User user= (User) session.getAttribute("user");
            model.addAttribute("user",user);
            return "index";
        }catch (Exception e)
        {
             return  "500";
        }
    }

    @RequestMapping("getVote")
    @ResponseBody
    public Map getAllVote(Vote vote){
       try {
        List<Vote> voteList=voteService.getVote(vote);
           for (int i = 0; i < voteList.size(); i++) {
               voteList.get(i).setVoteOption(voteService.selectListvoteOptionByvoteId(voteList.get(i).getVoteId()));
           }
           return Helper.getInstance().successJsonResultMap(voteList,"查询成功");
       }catch (Exception e)
       {
           return Helper.getInstance().errorJsonResultMap("SERVER_ERROR","服务器异常:"+e.getCause());
       }
    }
    @RequestMapping("vote")
    @ResponseBody
    public Map getAllVote(VoteRecord voteRecord){
        try {

            voteService.addVoteRecord(voteRecord);
            return Helper.getInstance().successJsonResultMap(null,"");
        }catch (Exception e)
        {
            return Helper.getInstance().errorJsonResultMap("SERVER_ERROR","服务器异常:"+e.getCause());
        }
    }

}
