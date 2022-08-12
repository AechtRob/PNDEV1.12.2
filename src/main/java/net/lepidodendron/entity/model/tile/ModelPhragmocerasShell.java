package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelPhragmocerasShell extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;

    public ModelPhragmocerasShell() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -10.0F);
        this.setRotateAngle(body, 0.3054F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 19, 48, -3.5F, -7.25F, 4.0F, 7, 7, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 50, 12, -3.5F, -1.2F, 2.0F, 7, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.45F, 2.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5236F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 49, -3.5F, -2.925F, 0.6F, 7, 4, 2, 0.01F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(-0.5F, 2.1384F, 6.049F);
        this.body.addChild(shell);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.8384F, -3.549F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.7418F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 48, 31, -2.5F, -2.25F, 0.5F, 6, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -12.5144F, 0.1666F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6109F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 0, -3.5F, -0.0841F, -0.0655F, 8, 4, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -7.3647F, 14.9799F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.6144F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 19, 0.0F, -2.075F, -1.2F, 0, 3, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -4.38F, 15.3089F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.829F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 37, -0.5F, -1.8337F, -1.8454F, 1, 2, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -4.38F, 17.3089F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.0F, -1.1727F, -1.8533F, 2, 2, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -5.18F, 18.1089F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.6545F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 50, 5, -1.5F, -1.4F, -1.15F, 3, 3, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -9.8853F, 21.2731F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.6144F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 43, 48, -2.0F, -0.3197F, -0.7642F, 4, 4, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -12.1712F, 17.6884F);
        this.shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.9643F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 37, -2.5F, -2.5F, -3.5F, 5, 5, 7, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -8.7659F, 17.6707F);
        this.shell.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.6319F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 29, -2.5F, 0.4F, -7.75F, 6, 11, 8, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -11.6347F, 6.3047F);
        this.shell.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.9163F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 18, -3.0F, -3.75F, -4.5F, 7, 8, 11, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -4.1922F, 5.6822F);
        this.shell.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -3.5F, -3.85F, -6.825F, 8, 7, 11, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.6638F, 8.4515F);
        this.shell.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.7941F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 25, 21, -2.0F, -2.25F, -2.5F, 5, 3, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 29, 9, -2.5F, -2.945F, -0.0342F, 6, 3, 9, -0.01F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.body.offsetY = -1.2F;
        this.body.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
