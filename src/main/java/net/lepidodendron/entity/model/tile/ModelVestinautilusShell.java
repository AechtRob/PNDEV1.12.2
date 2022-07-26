package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelVestinautilusShell extends AdvancedModelBase {
    private final AdvancedModelRenderer whole;
    private final AdvancedModelRenderer topmiddleright;
    private final AdvancedModelRenderer topmiddleleft;
    private final AdvancedModelRenderer lowerleft;
    private final AdvancedModelRenderer bottommiddleleft;
    private final AdvancedModelRenderer bottommiddleright;
    private final AdvancedModelRenderer bottomright;
    private final AdvancedModelRenderer bottom;
    private final AdvancedModelRenderer toprightarm;
    private final AdvancedModelRenderer topleft;
    private final AdvancedModelRenderer top;
    private final AdvancedModelRenderer hood;
    private final AdvancedModelRenderer hood_r1;
    private final AdvancedModelRenderer hood_r2;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer shell_r1;
    private final AdvancedModelRenderer shell_r2;
    private final AdvancedModelRenderer shell_r3;
    private final AdvancedModelRenderer shell_r4;
    private final AdvancedModelRenderer shell_r5;
    private final AdvancedModelRenderer shell_r6;
    private final AdvancedModelRenderer shell_r7;
    private final AdvancedModelRenderer shell_r8;
    private final AdvancedModelRenderer shell_r9;
    private final AdvancedModelRenderer shell_r10;
    private final AdvancedModelRenderer shell_r11;

    public ModelVestinautilusShell() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.whole = new AdvancedModelRenderer(this);
        this.whole.setRotationPoint(-4.0F, 15.0F, -12.0F);
        this.setRotateAngle(whole, -1.6144F, 0.0F, 0.0F);


        this.topmiddleright = new AdvancedModelRenderer(this);
        this.topmiddleright.setRotationPoint(7.0F, 4.25F, -0.5F);
        this.whole.addChild(topmiddleright);


        this.topmiddleleft = new AdvancedModelRenderer(this);
        this.topmiddleleft.setRotationPoint(1.0F, 4.5F, -0.5F);
        this.whole.addChild(topmiddleleft);
        this.setRotateAngle(topmiddleleft, 0.0873F, 0.0F, 0.0F);


        this.lowerleft = new AdvancedModelRenderer(this);
        this.lowerleft.setRotationPoint(2.1F, 3.75F, 3.6F);
        this.whole.addChild(lowerleft);


        this.bottommiddleleft = new AdvancedModelRenderer(this);
        this.bottommiddleleft.setRotationPoint(1.0F, 3.75F, 1.5F);
        this.whole.addChild(bottommiddleleft);
        this.setRotateAngle(bottommiddleleft, -0.0436F, 0.0F, 0.0F);


        this.bottommiddleright = new AdvancedModelRenderer(this);
        this.bottommiddleright.setRotationPoint(7.0F, 3.75F, 1.25F);
        this.whole.addChild(bottommiddleright);


        this.bottomright = new AdvancedModelRenderer(this);
        this.bottomright.setRotationPoint(6.0F, 3.75F, 3.5F);
        this.whole.addChild(bottomright);


        this.bottom = new AdvancedModelRenderer(this);
        this.bottom.setRotationPoint(4.0F, 3.75F, 3.5F);
        this.whole.addChild(bottom);


        this.toprightarm = new AdvancedModelRenderer(this);
        this.toprightarm.setRotationPoint(6.0F, 4.75F, -2.5F);
        this.whole.addChild(toprightarm);


        this.topleft = new AdvancedModelRenderer(this);
        this.topleft.setRotationPoint(2.0F, 4.75F, -2.5F);
        this.whole.addChild(topleft);


        this.top = new AdvancedModelRenderer(this);
        this.top.setRotationPoint(4.0F, 4.75F, -2.5F);
        this.whole.addChild(top);


        this.hood = new AdvancedModelRenderer(this);
        this.hood.setRotationPoint(8.0F, -4.0F, -2.0F);
        this.whole.addChild(hood);
        this.setRotateAngle(hood, 1.5708F, 0.0F, 0.0F);


        this.hood_r1 = new AdvancedModelRenderer(this);
        this.hood_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hood.addChild(hood_r1);
        this.setRotateAngle(hood_r1, -0.0436F, 0.0F, 0.0F);
        this.hood_r1.cubeList.add(new ModelBox(hood_r1, 68, 56, -8.0F, -5.25F, -0.25F, 8, 8, 3, 0.0F, false));

        this.hood_r2 = new AdvancedModelRenderer(this);
        this.hood_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hood.addChild(hood_r2);
        this.setRotateAngle(hood_r2, -0.0873F, 0.0F, 0.0F);
        this.hood_r2.cubeList.add(new ModelBox(hood_r2, 0, 70, -9.0F, -5.75F, 1.25F, 10, 10, 2, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(7.5F, 0.0F, 2.0F);
        this.whole.addChild(shell);


        this.shell_r1 = new AdvancedModelRenderer(this);
        this.shell_r1.setRotationPoint(0.0F, -8.0F, -14.0F);
        this.shell.addChild(shell_r1);
        this.setRotateAngle(shell_r1, 0.8727F, -0.0436F, 0.0F);
        this.shell_r1.cubeList.add(new ModelBox(shell_r1, 0, 21, -3.6393F, -5.7495F, 6.6307F, 1, 8, 2, 0.0F, false));

        this.shell_r2 = new AdvancedModelRenderer(this);
        this.shell_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(shell_r2);
        this.setRotateAngle(shell_r2, -0.0873F, -0.0436F, 0.0F);
        this.shell_r2.cubeList.add(new ModelBox(shell_r2, 0, 0, -4.5F, -12.5F, -10.25F, 2, 8, 2, 0.0F, false));

        this.shell_r3 = new AdvancedModelRenderer(this);
        this.shell_r3.setRotationPoint(-3.75F, -7.0F, -17.0F);
        this.shell.addChild(shell_r3);
        this.setRotateAngle(shell_r3, 0.6109F, 0.0F, 0.0F);
        this.shell_r3.cubeList.add(new ModelBox(shell_r3, 36, 0, -1.75F, 3.2349F, 0.1785F, 4, 4, 8, 0.0F, false));

        this.shell_r4 = new AdvancedModelRenderer(this);
        this.shell_r4.setRotationPoint(-4.25F, -19.0F, -11.0F);
        this.shell.addChild(shell_r4);
        this.setRotateAngle(shell_r4, 0.6109F, 0.0F, 0.0F);
        this.shell_r4.cubeList.add(new ModelBox(shell_r4, 60, 31, -2.25F, 3.5322F, -17.2149F, 6, 6, 6, 0.0F, false));

        this.shell_r5 = new AdvancedModelRenderer(this);
        this.shell_r5.setRotationPoint(-3.75F, -7.0F, -17.0F);
        this.shell.addChild(shell_r5);
        this.setRotateAngle(shell_r5, -0.0873F, 0.0F, 0.0F);
        this.shell_r5.cubeList.add(new ModelBox(shell_r5, 60, 0, -2.25F, 0.4849F, -1.8215F, 5, 5, 7, 0.0F, false));

        this.shell_r6 = new AdvancedModelRenderer(this);
        this.shell_r6.setRotationPoint(-4.25F, -19.0F, -11.0F);
        this.shell.addChild(shell_r6);
        this.setRotateAngle(shell_r6, 0.1309F, 0.0F, 0.0F);
        this.shell_r6.cubeList.add(new ModelBox(shell_r6, 62, 67, -2.75F, 0.2822F, -14.2149F, 7, 12, 6, 0.0F, false));

        this.shell_r7 = new AdvancedModelRenderer(this);
        this.shell_r7.setRotationPoint(-4.25F, -19.0F, -11.0F);
        this.shell.addChild(shell_r7);
        this.setRotateAngle(shell_r7, -0.829F, 0.0F, 0.0F);
        this.shell_r7.cubeList.add(new ModelBox(shell_r7, 0, 48, -3.25F, -1.9678F, -8.2149F, 8, 14, 8, 0.0F, false));

        this.shell_r8 = new AdvancedModelRenderer(this);
        this.shell_r8.setRotationPoint(-4.25F, -15.0F, -2.0F);
        this.shell.addChild(shell_r8);
        this.setRotateAngle(shell_r8, 0.5672F, 0.0F, 0.0F);
        this.shell_r8.cubeList.add(new ModelBox(shell_r8, 0, 21, -4.25F, -10.427F, -6.6562F, 10, 13, 11, 0.0F, false));

        this.shell_r9 = new AdvancedModelRenderer(this);
        this.shell_r9.setRotationPoint(-4.25F, -19.0F, -11.0F);
        this.shell.addChild(shell_r9);
        this.setRotateAngle(shell_r9, -0.0436F, 0.0F, 0.0F);
        this.shell_r9.cubeList.add(new ModelBox(shell_r9, 30, 33, -3.75F, -7.2178F, -5.4649F, 9, 11, 12, 0.0F, false));

        this.shell_r10 = new AdvancedModelRenderer(this);
        this.shell_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(shell_r10);
        this.setRotateAngle(shell_r10, 0.0436F, 0.0F, 0.0F);
        this.shell_r10.cubeList.add(new ModelBox(shell_r10, 0, 0, -9.5F, -15.75F, -8.25F, 12, 9, 12, 0.0F, false));

        this.shell_r11 = new AdvancedModelRenderer(this);
        this.shell_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(shell_r11);
        this.setRotateAngle(shell_r11, 0.1745F, 0.0F, 0.0F);
        this.shell_r11.cubeList.add(new ModelBox(shell_r11, 42, 15, -10.0F, -10.25F, -0.25F, 13, 8, 6, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.whole.offsetY = -0.06F;
        this.whole.render(0.034f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
