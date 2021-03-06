package hu.daniel.hari.exercises.cleanarchitecture.payrollcasestudy.adapters.primary.admin.gui.views_controllers_uis.mainframe.mainpanel.pay.paylist;

import java.util.List;

import hu.daniel.hari.exercises.cleanarchitecture.payrollcasestudy.adapters.primary.admin.gui.views_controllers_uis.ModelConsumer;
import hu.daniel.hari.exercises.cleanarchitecture.payrollcasestudy.adapters.primary.admin.gui.views_controllers_uis.View;

public interface PayListView extends
	View,
	ModelConsumer<PayListView.PayListViewModel>
{
		
	public static class PayListViewModel {
		public List<PayListViewItem> payListViewItems;
		
		public PayListViewModel(List<PayListViewItem> payListViewItems) {
			this.payListViewItems = payListViewItems;
		}

		public static class PayListViewItem {
			public int id;
			public String name;
			public String waging;
			public int grossAmount;
			public int deductionsAmount;
			public int netAmount;
			public String paymentMethod;
		}
		
	}
}
