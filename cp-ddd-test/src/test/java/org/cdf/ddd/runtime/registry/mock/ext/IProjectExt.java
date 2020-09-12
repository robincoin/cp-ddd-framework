package org.cdf.ddd.runtime.registry.mock.ext;

import org.cdf.ddd.ext.IDomainExtension;
import org.cdf.ddd.runtime.registry.mock.model.FooModel;

public interface IProjectExt extends IDomainExtension {

    Integer execute(FooModel model);

}
