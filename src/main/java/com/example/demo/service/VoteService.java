package com.example.demo.service;

import com.example.demo.domain.Vote;
import com.example.demo.mapper.VoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteService {
    @Autowired
    VoteMapper voteMapper;

    public List<Vote> getVote(Vote vote) {
        return voteMapper.getAllVote(vote);
    }
}
