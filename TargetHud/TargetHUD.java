
	@Override
	public void renderDummy(int mouseX, int mouseY) {
		//Gui.drawRect(getX(), getY() - 10, getX() + fr.getStringWidth(mc.thePlayer.getName()) + 40, getY() + getHeight(), new Color(0, 0, 0, 170).getRGB());
		//fr.drawStringWithShadow(mc.thePlayer.getName(), getX() + 2, getY() + 2, -1);
		//fr.drawStringWithShadow("�a20 �c \u2764 �f", getX() + 2, getY() + 2 + fr.FONT_HEIGHT, -1);
		//fr.drawStringWithShadow("Are You Winning?", getX() + 2, getY() + 13 + fr.FONT_HEIGHT, -1);
		//GuiInventory.drawEntityOnScreen(getX() + fr.getStringWidth(mc.thePlayer.getName()) + 30, getY() + 30, 20, 50, 0, mc.thePlayer);	
		Gui.drawRect(getX(), getY() - 10, getX() + fr.getStringWidth(mc.thePlayer.getName()) + 40, getY() + getHeight(), new Color(0, 0, 0, 250).getRGB());
		fr.drawStringWithShadow(mc.thePlayer.getName(), getX() + 2, getY() + 2, -1);
		Gui.drawRect(getX() + 27, getY()+27, getX()+ 120,getY()+35, new Color(25,23,13).getRGB());
		Gui.drawRect(getX() + 27, getY()+27, getX()+ 27+(int)(93*(20/20)),getY()+35, new Color(233,55,65).getRGB());
		GuiInventory.drawEntityOnScreen(getX() + fr.getStringWidth(mc.thePlayer.getName()) + 30, getY() + 30, 20, 50, 0,mc.thePlayer);
		super.renderDummy(mouseX, mouseY);
	}
	
	@Override
	public int getWidth() {
		return 70;
	}
	
	@Override
	public int getHeight() {
		return fr.FONT_HEIGHT * 2 + 15;
	}
	
	private void renderTargetHud(){
		target = (EntityLivingBase)mc.pointedEntity;
		
		if(target != null) {
			Gui.drawRect(getX(), getY() - 10, getX() + fr.getStringWidth(target.getName()) + 40, getY() + getHeight(), new Color(0, 0, 0, 250).getRGB());
			fr.drawStringWithShadow(target.getName(), getX() + 2, getY() + 2, -1);
			
			if(target.getHealth() >= 10) {
				fr.drawStringWithShadow("�a" + (int)target.getHealth() + "�c \u2764 �f", getX() + 2, getY() + 2 + fr.FONT_HEIGHT, -1);
			}else if(target.getHealth() <= 10) {
				fr.drawStringWithShadow("�e" + (int)target.getHealth() + "�c \u2764 �f", getX() + 2, getY() + 2 + fr.FONT_HEIGHT, -1);
			}else if(target.getHealth() == 0) {
				fr.drawStringWithShadow("�4" + (int)target.getHealth() + "�c \u2764 �f", getX() + 2, getY() + 2 + fr.FONT_HEIGHT, -1);
			}
		
			GuiInventory.drawEntityOnScreen(getX() + fr.getStringWidth(target.getName()) + 30, getY() + 30, 20, 50, 0, target);
		}
		
	}
	
	private void renderAstolfoNewTargetHud() {
		target = (EntityLivingBase)mc.pointedEntity;
		if(target != null) {
			if(fr.getStringWidth(target.getName()) < 27+(int)(93*(target.getHealth()/target.getMaxHealth()))){
				Gui.drawRect(getX(), getY() - 10, getX() + 27+(int)(93*(target.getHealth()/target.getMaxHealth())) + 3, getY() + getHeight(), new Color(0, 0, 0, 190).getRGB());
			}else {
				Gui.drawRect(getX(), getY() - 10, getX() + fr.getStringWidth(target.getName()) + 40, getY() + getHeight(), new Color(0, 0, 0, 190).getRGB());
			}
			GlStateManager.pushMatrix();
			GlStateManager.scale(0.5, 0.5, 0.5);
			fr.drawStringWithShadow(target.getName(), getX()+225, getY() + 4, -1);
			GlStateManager.popMatrix();
			GuiInventory.drawEntityOnScreen(getX() + 13, getY() + 30, 20, -180, 0, target);
			GlStateManager.pushMatrix();
			GlStateManager.scale(2, 2, 2);
			fr.drawStringWithShadow((int)target.getHealth() + " \u2764", getX()+26, getY()+15,  new Color(193,15,25).getRGB());
			GlStateManager.popMatrix();
			Gui.drawRect(getX() + 27, getY()+20, getX()+ 120,getY()+30, new Color(25,23,13).getRGB());
			Gui.drawRect(getX() + 27, getY()+20, getX()+ 27+(int)(93*(target.getHealth()/target.getMaxHealth())),getY()+30, new Color(233,55,65).getRGB());
			//Gui.drawPlayerHead(getX() + fr.getStringWidth(target.getName()) + 30, getY() + 30, 20, target);
		}
	}
	
	private void renderEvelinaTargetHud() {
		target = (EntityLivingBase)mc.pointedEntity;
		if(target != null) {
			Gui.drawRect(getX(), getY() + 30, getX() + 123, getY() + getHeight() - 32, new Color(0, 0, 0, 190).getRGB());
			fr.drawStringWithShadow(target.getName(), getX()+26, getY() + 4, -1);
			fr.drawStringWithShadow((int)target.getHealth() + " \u2764", getX()+26, getY()+15,  new Color(193,15,25).getRGB());
			Gui.drawRect(getX(), getY()+26, getX()+123,getY()+30, new Color(25,23,13).getRGB());
			Gui.drawRect(getX(), getY()+26, getX()+30+(int)(93*(target.getHealth()/target.getMaxHealth())),getY()+30, new Color(233,55,65).getRGB());
			Gui.drawPlayerHead(getX() + 8, getY() + 10, 20, target);
		}
	}
	
}
