/*
 * Copyright 2013 must-be.org
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

package org.mustbe.consulo.twig.psi;

import java.util.List;

import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.extensions.ExtensionPointName;

/**
 * @author VISTALL
 * @since 05.11.13.
 */
public interface TwigVariableProvider
{
	ExtensionPointName<TwigVariableProvider> EP_NAME = ExtensionPointName.create("org.mustbe.consulo.twig.variableProvider");

	@NotNull
	List<TwigVariable> getVariables(@NotNull TwigFile twigFile);
}
