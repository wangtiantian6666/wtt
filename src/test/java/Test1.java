import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wangtiantian.mapper.MyMapper;
import com.wangtiantian.pojo.Goods;

public class Test1 {
	ClassPathXmlApplicationContext cax=new ClassPathXmlApplicationContext("applicationContext.xml");
	MyMapper bean = cax.getBean(MyMapper.class);
	@Test
	public void test1(){
		Goods byId = bean.getById(1);
		System.out.println(byId);
	}
	@Test
	public void delete(){
		bean.delete2(14);
	}
	@Test
	public void add(){
		 bean.save(new Goods("小米", 3, 3, "2019-12-09", 1111, 0));
	}
}
