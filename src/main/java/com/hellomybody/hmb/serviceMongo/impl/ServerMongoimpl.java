package com.hellomybody.hmb.serviceMongo.impl;

import com.hellomybody.hmb.bean.Question;
import com.hellomybody.hmb.mongoDao.mongoDao;
import com.hellomybody.hmb.serviceMongo.serverMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
//import org.springframework.transaction.annotation.Transactional;

@Service("serverMongoImpl")
public class ServerMongoimpl implements serverMongo {

    @Autowired
//    private MongoTemplate mongoTemplate;
    private mongoDao mongodao;
    /**
     * 创建对象
     * @param question
     */
//    @Override
//    public void saveQuestion(Question question) {
//        mongodao.save(question);
//    }
//
//    @Override
//    public List<Question> findAll(Question fanban) {
//        Query query=new Query();
//        query.with(new Sort(new Sort.Order(Sort.Direction.DESC,"creationDate")));
//        List<Question> all = mongodao.find(query,Question.class);
//        return all;

//    }
//    更新或添加
    @Override
    public void UpdateQuestion(Question question) {
        HashMap<String,Object> res = new HashMap<>();
//        List<Question> list=mongodao.findAll();
//        Integer a= Integer.valueOf(list.get(list.size()-1).getArticleId());
//        question.setArticleId(""+(a+1)+"");
//        question.setArticleId("1");
//        question.setVote_up("0");
//        question.setVote_down("0");
        mongodao.save(question);
    }


    //查询资源的所有评论
    @Override
    public List<Question> findallquestion(String Id) {
        if (null == Id) {
            return null;
        }
        Question mongodb = new Question();
//        mongodb.setId(Id);
//        MongoTemplate.findAll(new Question(new Criteria()),Question.class);
        System.out.println(mongodao.findAll(Example.of(mongodb)));
        return mongodao.findAll(Example.of(mongodb));

//        List<Question> q = mongodao.findAll(Example.of(mongodb));
//        /*   创建hashmap  用于存放结果 */
//        HashMap<String,Object> res = new HashMap<>();
////        res.put("numbers",numbers);         //最大页
//        res.put("data",q);              //结果
////        创建json对象，将string类型的结果转码为json
//        String ss;
//        return ss = JSON.toJSONString(res);
//        System.out.println(ss);
//        return res;
    }
//查询
//    public List<Map<String,Object>> list(){
//        List<Map<String,Object>> list1=new ArrayList<>();
//        Question question=new Question();
////        question.setId("0");
//        List<Question> list=mongodao.findAll(Example.of(question));
//        Integer a=0;
//        for (Question c:list){
//            Map<String,Object> map=new HashMap<>();
//            map.put("luozhu",c);
//            Question question1=new Question();
////            question1.setParetid(list.get(a).getArticleId());
//            map.put("zilou",mongodao.findAll(Example.of(question1)));
//            list1.add(map);
//            a++;
//        }
//        return list1;
//    }
//	求总数
//    public int getpicturenum() {
//    return (int) mongodao.count();
//}
//    public void SaveorUpdatePicture(Question p) {
//        mongodao.save(p);
//    }
//
//    public List<Question> getsearchresult(int current, int rowCount,
//                                         String sortid, String search) {
//        PageRequest pr;
//        if("asc".equals(sortid))
//            pr =new PageRequest(--current, rowCount, Sort.Direction.ASC,"id");
//        else if("desc".equals(sortid))
//            pr =new PageRequest(--current, rowCount, Sort.Direction.DESC,"id");
//        else
//            pr =new PageRequest(--current, rowCount);
//        Page<Question> page=mongodao.findByNameContaining(search, pr);
//        return page.getContent();
//    }
//
//    public int getsearchresulttotal(String search) {
//        List<Question> list=mongodao.findByNameContaining(search);
//        return list.size();
//    }
//    ...............================
//    public boolean add(LyBeanQ comment){
//        List<LyBeanQ> list=mongodao.findAll();
//        Integer a= Integer.valueOf(list.get(list.size()-1).getArticleId());
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = new Date();

//        comment.setCreateDateTime(format.format(date));
//        comment.setArticleId(""+(a+1)+"");
//        comment.setName("");
//        comment.setTitle("");
//        comment.setNews("");
//        comment.setAsktime("");
//        comment.setVote_up("0");
//        comment.setVote_down("0");
//        System.out.println(mongodao.save(comment));

//        if (comment.getParetid()!="0"){
//            LyBeanQ commentAll=new LyBeanQ();
//            commentAll.setParetid(comment.getParetid());
//            List<LyBeanQ> list2=mongodao.findAll(Example.of(commentAll));
//            LyBeanQ commentOne=new LyBeanQ();
//            commentOne.setArticleId(comment.getParetid());
//            List<LyBeanQ> list3=mongodao.findAll(Example.of(commentOne));
//            commentOne=list3.get(0);
//            commentOne.setReplunum(list2.size());
//            mongodao.save(commentOne);
//        }
//        return true;
//    }
//删除
//    public boolean del(String id){
//        LyBeanQ comment=new LyBeanQ();
//        comment.set_id(id);
//        List<LyBeanQ> list=mongodao.findAll(Example.of(comment));
//        if (list==null){
//            return false;
//        }
//        mongodao.deleteById(id);
//        return true;
//    }
//更新
//    public boolean update(String id){
//        LyBeanQ comment=new LyBeanQ();
//        comment.set_id(id);
//        List<LyBeanQ> list=mongodao.findAll(Example.of(comment));
//        if (list==null){
//            return false;
//        }
//        LyBeanQ comment1=list.get(0);
//        comment1.set_id(id);
//        comment1.setLikenum(list.get(0).getLikenum()+1);
//        System.out.println(mongodao.save(comment1));
//        return true;
//    }

}
