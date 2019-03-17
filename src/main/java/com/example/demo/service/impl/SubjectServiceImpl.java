package com.example.demo.service.impl;

import com.example.demo.dao.SubjectMapper;
import com.example.demo.entity.Subject;
import com.example.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service("subjectService")
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectMapper subjectMapper;
    //添加试题，如果试题标题已经纯在，就不能添加
    public boolean saveSubject(Subject subject){
        String stTitle=subject.getSttitle();
        if(subjectMapper.selectByStTitle(stTitle)!=null)
            return true;
        return false;
    }
    //按照分页信息来查询试题
    //public PageResult querySubjectByPage(Page page);
    //查找试题详细信息
    public Subject showSubjectDetail(int subjectID){
        return subjectMapper.selectByPrimaryKey(subjectID);
    }
    //更新试题信息
    public void updateSubject(Subject subject){
        subjectMapper.updateByPrimaryKey(subject);
    }
    //删除试题信息
    public void deleteSubject(int subjectID){
        subjectMapper.deleteByPrimaryKey(subjectID);
    }
    //模糊查询试题信息
    //public PageResult likeQueryBySubjectTitle(String subjectTitle,Page page);
    //随机查询试题信息
    public List<Subject> randomFindSubject(int number){
        List<Subject> list=new ArrayList<>();
        return list;
    }
    /**
     * 计算成绩
     * @param subjectIDs 传入的试题id List
     * @param studentAnswers 传入的学生回答 List
     */
    public int accountResult(List<Integer> subjectIDs,List<String> studentAnswers){
        return 0;
    }
    //查询试题数量
    public int countSubject(){
        List<Subject> list=subjectMapper.getAllSubjects();
        return list.size();
    }
    //查询到的试题数量
    public int countLikeSubject(String title){
        return 0;
    }
}
