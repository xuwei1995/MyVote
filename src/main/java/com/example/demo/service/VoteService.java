package com.example.demo.service;

import com.example.demo.domain.Vote;
import com.example.demo.domain.VoteOption;
import com.example.demo.domain.VoteRecord;
import com.example.demo.mapper.VoteMapper;
import com.example.demo.mapper.VoteOptionMapper;
import com.example.demo.mapper.VoteRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteService {
    @Autowired
    VoteMapper voteMapper;
    @Autowired
    private VoteRecordMapper voteRecordMapper;
    @Autowired
    private VoteOptionMapper voteOptionMapper;

    public List<Vote> getVote(Vote vote) {
        return voteMapper.getAllVote(vote);
    }

    public List<VoteOption> selectListvoteOptionByvoteId(Long voteId) {
        return  voteOptionMapper.selectListvoteOptionByvoteId(voteId);
    }

    public void addVoteRecord(VoteRecord voteRecord) {
        voteRecordMapper.insert(voteRecord);
    }
}
