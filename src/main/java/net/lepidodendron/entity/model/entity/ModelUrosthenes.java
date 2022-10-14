package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelUrosthenes extends AdvancedModelBase {
    private final AdvancedModelRenderer Urosthenes;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer PelvicR;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer PelvicL;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r20;

    public ModelUrosthenes() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Urosthenes = new AdvancedModelRenderer(this);
        this.Urosthenes.setRotationPoint(0.0F, 13.0F, 0.0F);


        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, -1.4F);
        this.Urosthenes.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 20, 25, -2.0F, -6.0F, -1.0F, 3, 13, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 9.3F, 1.0F);
        this.Body1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0349F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 55, 42, -1.5F, -4.1F, -1.3F, 2, 3, 6, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -8.9F, 0.0F);
        this.Body1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1396F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 47, 10, -1.5F, 1.2F, -1.2F, 2, 4, 6, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-2.0F, 3.0F, 1.0F);
        this.Body1.addChild(PectoralR);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.2F, -0.4F);
        this.PectoralR.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.6981F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.0F, -0.8F, -0.1F, 0, 5, 6, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(1.0F, 3.0F, 1.0F);
        this.Body1.addChild(PectoralL);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.2F, -0.4F);
        this.PectoralL.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.6981F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, -0.8F, -0.1F, 0, 5, 6, 0.0F, true));

        this.PelvicR = new AdvancedModelRenderer(this);
        this.PelvicR.setRotationPoint(-2.0F, 7.3F, 4.0F);
        this.Body1.addChild(PelvicR);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.0F, -0.3F);
        this.PelvicR.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.48F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 42, 63, 0.0F, 0.0F, -1.7F, 0, 6, 5, 0.0F, false));

        this.PelvicL = new AdvancedModelRenderer(this);
        this.PelvicL.setRotationPoint(1.0F, 7.3F, 4.0F);
        this.Body1.addChild(PelvicL);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.0F, -0.3F);
        this.PelvicL.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.48F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 42, 63, 0.0F, 0.0F, -1.7F, 0, 6, 5, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 1.0F, 4.9F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 46, 48, -1.5F, -6.0F, 1.1F, 2, 10, 4, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 27, 0, -0.5F, 3.0F, 0.1F, 0, 17, 5, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 32, -0.5F, -23.0F, 0.1F, 0, 17, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 8.8F, 1.5F);
        this.Body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3665F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 62, -1.0F, -6.6F, 0.0F, 1, 5, 5, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -10.1F, 1.1F);
        this.Body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2967F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 62, -1.0F, 0.95F, -1.0F, 1, 5, 6, -0.01F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 4.7F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 14, 0, -1.5F, -5.0F, 0.4F, 2, 7, 4, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 41, 28, -0.5F, -23.0F, 0.4F, 0, 19, 4, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 11, 32, -0.5F, 1.0F, 0.4F, 0, 19, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 5.1F, 0.6F);
        this.Body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6545F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 54, 58, -1.0F, -4.5193F, -0.0231F, 1, 5, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -8.4F, 2.4F);
        this.Body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.5149F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 1, 56, -1.0F, 1.4F, -1.1F, 1, 5, 5, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, -2.0F, 4.4F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 64, 12, -1.5F, -2.0F, 0.0F, 2, 4, 3, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 37, 50, -0.5F, 3.0F, 0.0F, 0, 19, 2, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 53, 26, -0.5F, -21.0F, 0.0F, 0, 19, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 4.3F, 0.0F);
        this.Body4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.7767F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 58, 33, -1.0F, -2.6F, -0.1F, 1, 3, 4, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Body4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.5061F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 49, 0, -1.0F, 0.3F, 0.5F, 1, 3, 3, -0.01F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body4.addChild(Body5);
        this.setRotateAngle(Body5, 0.0873F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -0.5F, -7.0F, 0.0F, 0, 18, 13, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.2F, 2.5F);
        this.Body5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3665F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 38, 0, -1.0F, -0.1F, -0.2F, 1, 1, 8, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 64, 66, -1.0F, -1.8F, 0.0F, 1, 2, 3, 0.0F, false));

        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 0.0F, -1.2F);
        this.Urosthenes.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 58, 0, -2.0F, -3.0F, -6.8F, 3, 7, 4, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 20, 46, -2.5F, -5.8F, -3.8F, 4, 11, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.0F, -2.8F);
        this.Cephalon.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3054F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 33, 0, -2.0F, 0.35F, -3.35F, 3, 2, 2, 0.03F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 23, 0, -2.0F, 0.85F, -2.85F, 3, 1, 1, 0.04F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 2.0F, -5.9F);
        this.Cephalon.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.5236F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 15, -1.5F, -1.3572F, -0.266F, 2, 4, 8, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -3.9F, -6.8F);
        this.Cephalon.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -1.1432F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 62, 52, -1.5F, -7.0F, -0.9F, 2, 6, 4, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -3.9F, -6.8F);
        this.Cephalon.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.48F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 58, 21, -1.5F, -1.4F, -0.1F, 2, 7, 4, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.3F, -5.3F);
        this.Cephalon.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.0873F, 0.0F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.9425F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 66, 38, -1.5F, 0.4428F, -2.166F, 2, 3, 3, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Urosthenes.render(f5 * 0.2F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.Urosthenes.rotateAngleY = (float) Math.toRadians(90);
        this.Urosthenes.offsetX = -0.09F;
        this.Urosthenes.offsetY = -0.16F;
        this.Urosthenes.offsetZ = 0.07F;
        this.Urosthenes.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Urosthenes.offsetY = 1.1F;

        AdvancedModelRenderer[] fishTail = {this.Body4, this.Body5};
        float speed = 0.28F;
        if (!e.isInWater()) {
            speed = 0.68F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.85F, -3, f2, 1);
            this.swing(Urosthenes, speed, 0.4F, true, 0, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), -0.3F, true, 0, -0.3F, f2, 1);
            this.walk(PectoralL, (float) (speed * 0.75), 0.4F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.4F, true, 0, 0, f2, 1);
            this.walk(PectoralR, (float) (speed * 0.75), 0.4F, true, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.75), 0.4F, true, 0, 0, f2, 1);
            this.walk(PelvicL, (float) (speed * 0.75), 0.4F, true, 2, 0, f2, 1);
            this.swing(PelvicL, (float) (speed * 0.75), 0.4F, true, 2, 0, f2, 1);
            this.walk(PelvicR, (float) (speed * 0.75), 0.4F, true, 2, 0, f2, 1);
            this.swing(PelvicR, (float) (speed * 0.75), 0.4F, true, 2, 0, f2, 1);
            if (!e.isInWater()) {
                this.Urosthenes.rotateAngleZ = (float) Math.toRadians(90);
                this.Urosthenes.offsetY = 1.25F;
                this.bob(Urosthenes, -speed, 5F, false, f2, 1);
            }
        }
    }
}
