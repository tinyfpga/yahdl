package hw.lang.ast;

public class CompilationUnit {
	public final PackageRef pkg;
	public final ModuleDef module;
	
	public CompilationUnit(
		final PackageRef pkg, 
		final ModuleDef module
	) {
		this.pkg = pkg;
		this.module = module;
	}
}
