package main;

import java.util.ArrayList;

public class Command implements ICom{
	ArrayList <ICom> executeList = new ArrayList<>();
	ArrayList <ICom> undoList = new ArrayList<>();
	
	public void addCommand(ICom command)
	{
		executeList.add(command);
		undoList.add(command);
	}
	

	@Override
	public void execute() {
		for(ICom command: executeList)
		{
			command.execute();
			executeList.remove(executeList.size()-1);
			
		}
		
	}

	@Override
	public void undo() 
	{
		int lastIndex = undoList.size() - 1;
		
		if(lastIndex>-1)
		{
			undoList.get(lastIndex).undo();
			undoList.remove(lastIndex);
			
		}
		else
		{
			System.out.println("Nothing to undo!");
		}
	}
	
	@Override
	public void redo() {
		(executeList.get(executeList.size() - 1)).execute();
	}
}
