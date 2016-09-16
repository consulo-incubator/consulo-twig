/*
 * Copyright 2013-2016 consulo.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package consulo.twig.psi.impl;

import org.jetbrains.annotations.NotNull;
import consulo.twig.psi.TwigConstantExpression;
import consulo.twig.psi.TwigVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiReference;
import com.intellij.psi.impl.source.resolve.reference.ReferenceProvidersRegistry;

/**
 * @author VISTALL
 * @since 05.11.13.
 */
public class TwigConstantExpressionImpl extends TwigExpressionImpl implements TwigConstantExpression
{
	public TwigConstantExpressionImpl(@NotNull ASTNode node)
	{
		super(node);
	}

	@NotNull
	@Override
	public PsiReference[] getReferences()
	{
		return ReferenceProvidersRegistry.getReferencesFromProviders(this);
	}

	@Override
	public void accept(@NotNull TwigVisitor visitor)
	{
		visitor.visitConstantExpression(this);
	}
}