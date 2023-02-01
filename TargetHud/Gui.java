//ADD This at the end of you GUI class in net/minecraft/client/gui/gui.class
    public static void drawPlayerHead(int x, int y, int width, EntityLivingBase player) {//width and height are the same number so yeah yes aha
    	NetworkPlayerInfo playerInfo = mc.getNetHandler().getPlayerInfo(player.getUniqueID());
    	if (playerInfo != null){
            mc.getTextureManager().bindTexture(playerInfo.getLocationSkin());
            GL11.glColor4f(1F, 1F, 1F, 1F);

            Gui.drawScaledCustomSizeModalRect((int) x - 5, (int) y - 5, 8F, 8F, 8, 8, 20, 20, 64F, 64F);
        }
}
