package com.honeywell.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.honeywell.test.model.AddFiltenessGoal;

@Controller
public class HelloTest {
	String message = "Welcome to Spring MVC Application Controller";

	Map filnessGoalMap = new HashMap();

	@RequestMapping("/createGoals")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("inside controller");

		ModelAndView mv = new ModelAndView("createNewGoal");
		mv.addObject("message", message);
		return mv;
	}

	@RequestMapping("/createNewGoal")
	public ModelAndView createNewFitnessGoal(@ModelAttribute("addGoal") AddFiltenessGoal addGoal) {
		System.out.println("inside controller of createNewFitnessGoal");

		System.out.println("name :  " + addGoal.getName());
		System.out.println("fitness Goal :  " + addGoal.getFitnessGoal());

		filnessGoalMap.put("name", addGoal.getName());
		filnessGoalMap.put("filnessGoal", addGoal.getFitnessGoal());

		ModelAndView mv = new ModelAndView("GoalAdded");
		mv.addObject("message", message);
		mv.addObject("fitnessgoalsMap", filnessGoalMap);
		return mv;
	}

	@RequestMapping("/loadChallenges")
	public ModelAndView loadFitnessGoal() {
		System.out.println("inside controller of load fitness challenges.");
		ModelAndView mv = new ModelAndView("loadFitnessChallenges");
		if (filnessGoalMap != null && !filnessGoalMap.isEmpty()) {

			mv.addObject("userName", filnessGoalMap.get("name"));
			mv.addObject("fitnessgoal", filnessGoalMap.get("filnessGoal"));
			return mv;

		}
		return mv;

	}

}
