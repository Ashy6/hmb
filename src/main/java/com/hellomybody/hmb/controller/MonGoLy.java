package com.hellomybody.hmb.controller;

import com.hellomybody.hmb.bean.Question;
import com.hellomybody.hmb.serviceMongo.serverMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
//@Controller
@RequestMapping(value ="/mongodb")
public class MonGoLy {
    @Resource(name="serverMongoImpl")
    @Autowired
    private serverMongo sm;

    /**
     * 获取所有
     * @return
     */
//    @RequestMapping("/getServerIp")
//    public Map<String,Object> getServerIp(@RequestBody Question question){
//        Map<String,Object> resultMap=new HashMap<String,Object>();
//        List<Question> questionList = sm.findAll(question);
//        List<ServerArray> serverArrays=new ArrayList<>();
//        for (Question fb:questionList){
//            ServerArray serverArray=new ServerArray();
////            serverArray.setValue(fb.getIp());
////            serverArray.setLabel(fb.getServerOwnership()+"-"+fb.getIp());
//            serverArrays.add(serverArray);
//        }
//        resultMap.put("success",true);
//        resultMap.put("data",serverArrays);
//        return resultMap;
//    }
//    @RequestMapping(value="/questionList", method=RequestMethod.GET)
//    @ResponseBody
//    public DataGrid<Question> getQlist(@RequestParam("current") int current,@RequestParam("rowCount") int rowCount
//            ,@RequestParam(required=false,value="sort[id]")String sortid
//            ,@RequestParam(required=false,value="searchPhrase")String searchPhrase){
//        if(searchPhrase==null){
//            List<Question> list=sm.getQlist(current,rowCount,sortid);
//            int total=sm.getquestionnum();
//            DataGrid<Question> grid=new DataGrid<Question>();
//            grid.setCurrent(current);
//            grid.setRowCount(rowCount);
//            grid.setRows(list);
//            grid.setTotal(total);
//            return grid;
//        }else{
//            List<Question> list=sm.getsearchresult(current, rowCount, sortid, searchPhrase);
//            int total=sm.getsearchresulttotal(searchPhrase);
//            DataGrid<Question> grid=new DataGrid<Question>();
//            grid.setCurrent(current);
//            grid.setRowCount(rowCount);
//            grid.setRows(list);
//            grid.setTotal(total);
//            return grid;
//        }
//    }
//    更新
//    @GetMapping("/update")
//    public String update (String id, Model model, HttpServletRequest request){
////        HttpSession session=request.getSession();
////        User user= (User) session.getAttribute("user");
//        boolean a=commentService.update(id);
//        if (!a){
//            return "error";
//        }
//        model.addAttribute("user",user);
//        model.addAttribute("state",commentService.list());
//        return "list";
//    }
//    查询
//    @GetMapping("/list")
//    public String list( Model model, HttpServletRequest request){
//        model.addAttribute("user",user);
//        model.addAttribute("state",commentService.list());
//        return "list";
//    }
//    查询
    @ResponseBody
    @RequestMapping(value = "/listQ")
//    public Object listComments(@PathVariable(value = "Id", required = true)String Id) throws Exception {
    public List<Question> getQList(Question question){
        return sm.findallquestion("%"+question.getId()+"%");
//        List<Question> questions = sm.findallquestion("%"+question.getId()+"%");
//        HashMap<String,Object> res = new HashMap<>();
////        res.put("numbers",numbers);         //最大页
//        res.put("data",questions);              //结果
////        创建json对象，将string类型的结果转码为json
//        String ss = JSON.toJSONString(res);
//        System.out.println(ss);
//        return res;
    }

//    //	查詢 id
//    @RequestMapping(value="/picture/{id}",method=RequestMethod.GET)
//    @ResponseBody
//    public Picture getpicture(@PathVariable("id")String id){
//        Picture p=mongodbService.getPictureByid(id);
//        return p;
//    }
//    删除
//    @GetMapping("/delte")
//    public String delte(String id, Model model,HttpServletRequest request){
//        boolean a=commentService.del(id);
//        if (!a){
//            return "error";
//        }
//        HttpSession session=request.getSession();
//        User user= (User) session.getAttribute("user");
//        model.addAttribute("user",user);
//        model.addAttribute("state",commentService.list());
//        return "list";
//    }
//    添加
    @RequestMapping(value="/addQuestion")
    public String UpdateQuestion(@RequestBody Question question){
        sm.UpdateQuestion(question);
        System.out.println(question);
    return "success";
    }

}
