package ahp;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "ahp.messages"; //$NON-NLS-1$
	public static String CriterionJudgmentSetName;
	public static String CriterionJudgmentSetEmptyName;
	public static String SubCriterionJudgmentSetName;
	public static String SubCriterionJudgmentSetEmptyName;
	public static String AlternativeJudgmentSetName;
	public static String AlternativeJudgmentSetEmptyName;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
