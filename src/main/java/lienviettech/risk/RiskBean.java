package lienviettech.risk;

import java.util.List;

import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
public class RiskBean {

	@Autowired
	RiskDao riskDao;

	public void setCarDao(RiskDao riskDao) {
		this.riskDao = riskDao;
	}

	public List<String> fetchRiskDetails() {

		return riskDao.getRiskDetails();
	}

}
