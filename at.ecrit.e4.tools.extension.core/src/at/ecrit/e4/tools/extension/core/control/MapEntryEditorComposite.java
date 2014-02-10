package at.ecrit.e4.tools.extension.core.control;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import at.ecrit.e4.tools.extension.core.listener.PersistedStateValueChangeListener;

public class MapEntryEditorComposite extends AbstractEditorComposite {

	final WritableValue value_description = new WritableValue("", String.class);

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 * @param context
	 * @param master
	 * @param editingDomain
	 * @param label
	 *            the label to show for the editor field
	 * @param key
	 *            the key for the persistent state map to bind to
	 */
	public MapEntryEditorComposite(Composite parent, int style,
			EMFDataBindingContext context, WritableValue master,
			EditingDomain editingDomain, String label, String key) {
		super(parent, style);
		setLayout(new GridLayout(3, false));

		master.addValueChangeListener(new MasterValueChangeListener(
				value_description, key));
		value_description
				.addValueChangeListener(new PersistedStateValueChangeListener(
						key, master, editingDomain));

		{
			Label l = new Label(this, SWT.NONE);
			l.setText(label);
			l.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));

			final Text text = new Text(this, SWT.BORDER | SWT.MULTI);
			GridData gd_text = new GridData(GridData.FILL_BOTH);
			gd_text.horizontalSpan = 2;
			text.setLayoutData(gd_text);

			context.bindValue(textProp.observeDelayed(200, text),
					value_description);
		}
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
