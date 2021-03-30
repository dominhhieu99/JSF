package lienviettech.risk;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RiskImpl implements RiskDao {

	@Override
	public List<String> getRiskDetails() {

		List<String> risks = new ArrayList<String>();

		risks.add(0, "Rules");
		risks.add(1, "Admin");
		risks.add(2, "Report");
		risks.add(3, "Risk Cube");
		risks.add(4, "Dashbroad");

		for (String c : risks) {
			System.out.println(c);
		}

		return risks;

	}

}
