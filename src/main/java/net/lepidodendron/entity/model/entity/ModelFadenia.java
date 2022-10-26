package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraFadeniaPermotriassic;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFadenia extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer gillL;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer gillR;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;

    private ModelAnimator animator;

    public ModelFadenia() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 15.6853F, -0.4735F);
        this.head.cubeList.add(new ModelBox(head, 0, 79, -1.0F, 0.3147F, -28.5265F, 2, 2, 7, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -1.6853F, -21.5265F, 6, 4, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 58, 14, -4.0F, -4.6853F, -17.5265F, 8, 7, 10, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 4.3147F, -20.5265F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 60, 31, -3.5F, -6.0F, 3.0F, 7, 7, 10, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 4.3147F, -20.5265F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 66, 0, -3.5F, -8.15F, 4.75F, 7, 2, 10, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 4.3147F, -20.5265F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.48F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 59, -2.5F, -6.5F, 0.75F, 5, 3, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 4.3147F, -20.5265F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 59, -1.0F, -6.25F, -5.75F, 2, 2, 3, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 54, 14, -2.0F, -6.25F, -2.75F, 4, 2, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, 2.3147F, -28.0265F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.3054F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 8, 0.0F, -1.98F, 0.0F, 2, 2, 7, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 2.3147F, -28.0265F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3054F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 74, 48, -2.0F, -1.99F, 0.0F, 2, 2, 7, 0.0F, false));

        this.gillL = new AdvancedModelRenderer(this);
        this.gillL.setRotationPoint(3.75F, 0.8147F, -12.2765F);
        this.head.addChild(gillL);
        this.setRotateAngle(gillL, 0.0F, 0.1309F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-4.0F, 3.5F, -8.25F);
        this.gillL.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 46, 82, 3.35F, -8.0F, 7.7F, 1, 8, 5, 0.0F, false));

        this.gillR = new AdvancedModelRenderer(this);
        this.gillR.setRotationPoint(-3.75F, 0.8147F, -12.2765F);
        this.head.addChild(gillR);
        this.setRotateAngle(gillR, 0.0F, -0.1309F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(4.0F, 3.5F, -8.25F);
        this.gillR.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 82, -4.35F, -8.0F, 7.7F, 1, 8, 5, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 2.2147F, -17.0265F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.1745F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.0F, -3.5F);
        this.lowerjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.2705F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 58, 19, 1.35F, 0.25F, -4.8F, 1, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.0F, -3.5F);
        this.lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1309F, -0.2705F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 37, 59, -2.35F, 0.25F, -4.8F, 1, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 2.0F, -3.5F);
        this.lowerjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 5, -1.49F, -1.5F, -2.75F, 3, 1, 3, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 14, -2.0F, -1.5F, 0.25F, 4, 2, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 2.0F, -3.5F);
        this.lowerjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5672F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 8, -0.99F, -3.75F, -5.0F, 1, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 2.0F, -3.5F);
        this.lowerjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 8, -1.0F, -0.8F, -4.75F, 1, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 1.875F, -3.5F);
        this.lowerjaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 60, 31, -2.0F, -0.625F, -4.3F, 2, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, 1.875F, -3.5F);
        this.lowerjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.5236F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 11, 12, -2.01F, -2.875F, -5.3F, 2, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 2.0F, -3.5F);
        this.lowerjaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 38, 0, -0.99F, 0.25F, -4.75F, 2, 1, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.0F, 2.0F, -5.0F);
        this.lowerjaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0873F, -0.2007F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 84, 31, 0.0F, -0.8807F, -0.2557F, 1, 2, 6, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 2.0F, -3.5F);
        this.lowerjaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 17, -1.5F, 0.25F, -1.75F, 3, 1, 2, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 72, 74, -2.0F, 0.25F, 0.25F, 4, 1, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.0F, 2.0F, -5.0F);
        this.lowerjaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2182F, -0.2007F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 79, 0.01F, -1.3807F, -1.2557F, 1, 2, 7, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.0F, 2.0F, -5.0F);
        this.lowerjaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2182F, 0.2007F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 75, 79, -1.01F, -1.3807F, -1.2557F, 1, 2, 7, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(2.0F, 2.0F, -5.0F);
        this.lowerjaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0873F, 0.2007F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 84, 12, -1.0F, -0.8807F, -0.2557F, 1, 2, 6, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.6853F, -8.5265F);
        this.head.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -4.5F, -5.0F, 0.0F, 9, 13, 20, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 32, 59, 0.0F, -17.0F, 0.5F, 0, 12, 11, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 5.0F, -12.0F);
        this.body1.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1047F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 38, 0, -4.0F, -12.5F, 11.0F, 8, 2, 12, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(4.5F, 4.25F, 4.0F);
        this.body1.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, 0.0F, 0.0F, -0.8727F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 30, 31, 0.01F, 0.0F, -2.75F, 0, 13, 15, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-4.5F, 4.25F, 4.0F);
        this.body1.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, 0.0F, 0.0F, 0.8727F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 30, 18, -0.01F, 0.0F, -2.75F, 0, 13, 15, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 1.0F, 20.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 49, 48, -3.5F, -4.75F, -1.5F, 7, 11, 11, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 1.0F, 9.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 59, -2.5F, -4.25F, -1.0F, 5, 9, 11, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 54, 70, -2.0F, -3.0F, -1.0F, 4, 6, 10, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.5F, 9.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 75, 60, -1.5F, -1.75F, -1.0F, 3, 4, 10, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 18, 0.0F, -12.5F, 6.0F, 0, 26, 15, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.head.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(gillL, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(gillR, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.1309F, 0.2705F, 0.0F);
        this.setRotateAngle(cube_r10, -0.1309F, -0.2705F, 0.0F);
        this.setRotateAngle(cube_r11, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, -0.0873F, -0.2007F, 0.0F);
        this.setRotateAngle(cube_r18, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.2182F, -0.2007F, 0.0F);
        this.setRotateAngle(cube_r20, 0.2182F, 0.2007F, 0.0F);
        this.setRotateAngle(cube_r21, -0.0873F, 0.2007F, 0.0F);
        this.setRotateAngle(body1, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(cube_r22, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(pectoralfinL, 0.0F, 0.0F, -0.8727F);
        this.setRotateAngle(pectoralfinR, 0.0F, 0.0F, 0.8727F);
        this.setRotateAngle(body2, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.48F, 0.0F);
        this.head.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.head.offsetY = 0.5F;
        //this.head.offsetZ = 1.1F;

        AdvancedModelRenderer[] fishTail = {this.body1, this.body2, this.body3, this.body4, this.body5};

        float speed = 0.24F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.5F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.285F;
        }

        if (e instanceof EntityPrehistoricFloraFadeniaPermotriassic) {
            speed = speed * 1.5F; //smaller mob less lazy
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still * 0.8F, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still * 0.8F, 0.25F * still, -0.55, f2, 0.6F * still);
            this.swing(head, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(head, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }

        this.flap(pectoralfinL, (float) (speed * 0.85), 0.25F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinL, (float) (speed * 0.85), 0.125F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinR, (float) (speed * 0.85), -0.25F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinR, (float) (speed * 0.85), -0.125F, true, 0, 0, f2, 0.5F);

        if (!e.isInWater()) {
            //this.body.rotateAngleZ = (float) Math.toRadians(90);
            //this.body.offsetY = 0.55F;
            this.bob(head, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

