package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelEbenaqua extends AdvancedModelBase {
    private final AdvancedModelRenderer Ebanaqua;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer AnalR;
    private final AdvancedModelRenderer AnalR2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;

    public ModelEbenaqua() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Ebanaqua = new AdvancedModelRenderer(this);
        this.Ebanaqua.setRotationPoint(-1.0F, 24.0F, -20.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Ebanaqua.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 73, 61, -1.0F, -11.0F, -7.0F, 4, 3, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 46, 97, -1.5F, -14.0F, -3.0F, 5, 7, 6, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 46, -1.5F, -17.0F, 2.0F, 5, 11, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -4.0F, 7.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.48F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 0, 0.0F, 0.1F, -4.9F, 0, 2, 4, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 12, -2.0F, -1.9F, -4.9F, 4, 2, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -6.0F, 3.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 38, -2.0F, -1.0F, -6.2F, 4, 1, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -7.0F, -3.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 62, 49, -2.0F, -1.9781F, -4.0079F, 4, 2, 4, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -13.0F, -3.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6632F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 98, 20, 0.0F, -3.0F, 4.2F, 0, 2, 9, -0.02F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 62, 38, -2.0F, -1.0F, -4.8F, 4, 4, 18, -0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, -10.0F, -9.3F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5672F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 52, 11, -1.0F, -0.973F, -0.6501F, 2, 2, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -10.0F, -9.3F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 62, 6, -1.5F, -1.173F, -0.8501F, 3, 2, 2, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -10.0F, -6.0F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 108, 22, -1.5F, -0.9F, -2.6F, 3, 3, 3, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(1.0F, -7.6F, -6.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.1309F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 57, 38, -1.5F, -1.0F, -3.1F, 3, 1, 3, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 0.1F, -2.7F);
        this.Jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 62, 14, 0.0F, -1.1F, -2.1F, 2, 1, 2, -0.01F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(1.0F, -13.0F, 7.0F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 65, -3.0F, -9.0F, 0.0F, 6, 18, 7, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.Body1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5411F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 78, 0, 0.0F, -2.9F, 0.25F, 0, 2, 8, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 91, -2.0F, -0.9F, 0.25F, 4, 5, 8, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.Body1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.384F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 62, 38, 0.0F, -0.9F, -1.3F, 0, 2, 8, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 96, 0, -2.0F, -4.9F, -1.3F, 4, 4, 8, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-3.0F, 6.5F, 1.0F);
        this.Body1.addChild(PectoralR);
        this.setRotateAngle(PectoralR, -0.5236F, -0.8727F, 0.0F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 0, 0, 0.0F, -1.5F, -1.0F, 0, 3, 4, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(3.0F, 6.5F, 1.0F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, -0.5236F, 0.8727F, 0.0F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 0, 0, 0.0F, -1.5F, -1.0F, 0, 3, 4, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 6.8F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 51, 61, -2.5F, -13.0F, 0.2F, 5, 24, 11, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 12.0F, 10.2F);
        this.Body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 105, -2.0F, -2.397F, -1.2215F, 4, 6, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 11.0F, 0.2F);
        this.Body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 105, 104, -2.0F, -1.7F, 7.9F, 4, 5, 2, -0.02F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 11.0F, 0.2F);
        this.Body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3927F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.0F, 0.8F, -0.5F, 0, 2, 9, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 84, 61, -2.0F, -4.2F, -0.5F, 4, 5, 9, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -15.0F, 10.2F);
        this.Body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2094F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 108, -2.0F, -3.7144F, -0.8164F, 4, 5, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -11.0F, 0.2F);
        this.Body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.5498F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 94, 0.0F, -4.0F, 0.0F, 0, 2, 11, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 0, -2.0F, -2.0F, 0.0F, 4, 6, 11, -0.01F, false));

        this.AnalR = new AdvancedModelRenderer(this);
        this.AnalR.setRotationPoint(-2.0F, 15.0F, 9.7F);
        this.Body2.addChild(AnalR);
        this.setRotateAngle(AnalR, 0.0F, 0.0F, 0.3491F);
        this.AnalR.cubeList.add(new ModelBox(AnalR, 0, 63, 0.0F, 0.0F, -1.5F, 0, 3, 3, 0.0F, false));

        this.AnalR2 = new AdvancedModelRenderer(this);
        this.AnalR2.setRotationPoint(2.0F, 15.0F, 9.7F);
        this.Body2.addChild(AnalR2);
        this.setRotateAngle(AnalR2, 0.0F, 0.0F, -0.3491F);
        this.AnalR2.cubeList.add(new ModelBox(AnalR2, 0, 63, 0.0F, 0.0F, -1.5F, 0, 3, 3, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, -1.0F, 10.9F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 27, 72, -2.0F, -14.0F, 0.3F, 4, 27, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -13.0F, -0.7F);
        this.Body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.6283F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 0.0F, -29.3F, -2.6F, 0, 25, 20, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 69, 97, -1.5F, -4.3F, -2.6F, 3, 5, 7, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 13.0F, 0.3F);
        this.Body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.5847F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 41, 0, -1.5F, -0.9F, -1.6F, 3, 4, 6, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 21, 26, 0.0F, 3.1F, -1.6F, 0, 25, 20, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 5.3F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 84, 76, -1.5F, -7.0F, 0.0F, 3, 15, 6, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 103, 76, -1.5F, -3.0F, 6.0F, 3, 8, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 8.0F, 7.5F);
        this.Body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.9599F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 102, 55, 0.0F, -0.179F, -0.7677F, 0, 5, 6, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 90, 104, -1.0F, -3.179F, 0.2323F, 2, 3, 5, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.Body4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.6545F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 89, 38, 0.0F, 2.8F, -2.6F, 0, 5, 11, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 94, 89, -1.0F, -2.2F, -1.6F, 2, 5, 9, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -5.0F, 8.0F);
        this.Body4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -1.0821F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 21, 0, 0.0F, -4.8369F, -1.0174F, 0, 5, 5, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 33, 105, -1.0F, -0.1369F, -0.3174F, 2, 3, 4, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -14.0F, 0.0F);
        this.Body4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.8203F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 81, 0, 0.0F, -5.0F, -1.0F, 0, 5, 14, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 81, 20, -1.0F, 0.0F, 0.0F, 2, 5, 12, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 1.1F, 8.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 101, 38, -1.0F, -2.1F, 1.0F, 2, 4, 5, 0.01F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 42, 0, 0.0F, -8.1F, 5.5F, 0, 18, 19, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -1.1F, 6.0F);
        this.Body5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3927F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 62, 0, -1.0F, -1.0F, -0.5F, 2, 2, 11, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 1.9F, 6.1F);
        this.Body5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2182F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 62, 0, -0.5F, -1.2F, -4.1F, 1, 1, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -2.1F, 5.5F);
        this.Body5.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.2094F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 108, 15, -0.5F, 0.0F, -5.0F, 1, 1, 5, 0.0F, false));


        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Ebanaqua.render(f5 * 0.065F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.Ebanaqua.rotateAngleY = (float) Math.toRadians(90);
        this.Ebanaqua.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.Ebanaqua.offsetY = 1.3F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body1, this.Body2, this.Body3,this.Body4,this.Body5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.1F, -1.5, f2, 1);
            this.swing(Ebanaqua, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), 0.5F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.Ebanaqua.rotateAngleZ = (float) Math.toRadians(90);
                this.Ebanaqua.offsetY = 1.35F;
                this.bob(Ebanaqua, -speed, 5F, false, f2, 1);
            }
        }
    }
}
