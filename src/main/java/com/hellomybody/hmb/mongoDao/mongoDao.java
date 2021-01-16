package com.hellomybody.hmb.mongoDao;

import com.hellomybody.hmb.bean.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface mongoDao extends MongoRepository<Question,String> {
//    Question findById(String id);	//根据id获取PO
//    Page<Question> findAll(Pageable pageable);//获取所有数据，带分页排序
//    Page<Question> findByNameContaining(String name,Pageable pageable);//根据文件名过滤，带分页排序
//    List<Question> findByNameContaining(String name);//根据文件名过滤的结果总数

//    List<LyBeanQ> findByarticleId(String articleId);//这个接口可以不用写方法，他自己有很多常规的方法，但有些不能满足使用要求就要自己写了。
//    public String addQuestion(Question question);
}
