package com.hellomybody.hmb.serviceMongo;

import com.hellomybody.hmb.bean.Question;

import java.util.List;

public interface serverMongo{
    //更新或者添加
    void UpdateQuestion(Question question);
    //获取一页记录
//    List<Question> getQlist(int current, int rowCount, String sortid);
    //获取总数目
//    int getquestionnum();
    //获取一页搜索结果
//    List<Question> getsearchresult(int current,int rowCount,String sortid,String search);
    //获取搜索结果总数
//    int getsearchresulttotal(String search);
//    Question getQuestionByid(String id);//使用主键获取记录
//    void deletePicture(String id);          //刪除

    //    查询question查询某资源的所有评论
    public List<Question> findallquestion(String Id);
//    public List<Question> findAll(Question question);
//    public void saveQuestion(Question question);
}
