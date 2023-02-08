package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelGriphognathus extends AdvancedModelBase {
    private final AdvancedModelRenderer Griphognathus;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer pectorafin1;
    private final AdvancedModelRenderer pectorafin2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer dorsalfin1;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer analfin;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer dorsalfin2;
    private final AdvancedModelRenderer pelvicfins2;
    private final AdvancedModelRenderer pelvicfins1;

    public ModelGriphognathus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Griphognathus = new AdvancedModelRenderer(this);
        this.Griphognathus.setRotationPoint(0.0F, 0F, 0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Griphognathus.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -12.0F, -12.0F, 5, 5, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -6.5F, -9.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 5, -2.5F, -1.375F, -3.0F, 5, 2, 6, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -9.0F, -12.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 44, 54, -2.0F, -2.0F, -5.0F, 4, 4, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 28, 17, -1.5F, -1.25F, -11.0F, 3, 1, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 12, 38, -2.0F, -1.325F, -5.5F, 4, 1, 1, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.9F, -11.3946F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.7589F, -0.7574F, 0.5775F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.7977F, -0.5F, -0.6121F, 1, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.9F, -11.3946F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.7589F, 0.7574F, -0.5775F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 3, -0.2023F, -0.5F, -0.6121F, 1, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -2.0F, -5.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 8, -1.5F, 0.0F, 0.0F, 4, 1, 5, -0.01F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 41, -1.0F, 0.0F, -4.0F, 3, 1, 4, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 2.0F, -5.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 32, -1.5F, -1.0F, 0.0F, 4, 1, 5, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0F, 0.0F, -5.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.1745F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 43, 0.0F, -1.25F, -3.0F, 1, 1, 3, -0.01F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.1864F, -0.1133F, -5.412F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5956F, -0.2046F, 0.0088F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 44, 0, -0.5F, -0.325F, -1.525F, 1, 1, 3, -0.01F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.75F, 0.5F, -6.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 2, -0.2F, -1.0F, -0.5F, 0, 2, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 2, 1.7F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.1864F, -0.1133F, -5.412F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5956F, 0.2046F, -0.0088F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 44, 0, -0.5F, -0.325F, -1.525F, 1, 1, 3, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.0F, 0.0F, -5.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1745F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 7, 43, -1.0F, -1.25F, -3.0F, 1, 1, 3, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.8727F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 42, 53, -1.0F, -1.0F, -0.25F, 2, 2, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.0F, -5.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.3927F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 31, 35, -1.0F, -1.0F, -6.0F, 2, 1, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, -0.75F, 0.75F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 21, 34, -2.0F, -1.025F, -6.0F, 2, 1, 6, -0.01F, false));

        this.pectorafin1 = new AdvancedModelRenderer(this);
        this.pectorafin1.setRotationPoint(2.5F, -7.625F, -10.5F);
        this.body.addChild(pectorafin1);
        this.setRotateAngle(pectorafin1, -0.6392F, -0.8908F, 0.4741F);
        this.pectorafin1.cubeList.add(new ModelBox(pectorafin1, 0, 24, -1.0F, -0.375F, -0.5F, 4, 1, 1, 0.0F, false));
        this.pectorafin1.cubeList.add(new ModelBox(pectorafin1, 41, 37, 0.0F, -1.625F, 0.0F, 5, 3, 0, 0.0F, false));

        this.pectorafin2 = new AdvancedModelRenderer(this);
        this.pectorafin2.setRotationPoint(-2.5F, -7.625F, -10.5F);
        this.body.addChild(pectorafin2);
        this.setRotateAngle(pectorafin2, -0.6392F, 0.8908F, -0.4741F);
        this.pectorafin2.cubeList.add(new ModelBox(pectorafin2, 0, 24, -3.0F, -0.375F, -0.5F, 4, 1, 1, 0.0F, true));
        this.pectorafin2.cubeList.add(new ModelBox(pectorafin2, 41, 37, -5.0F, -1.625F, 0.0F, 5, 3, 0, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -9.0F, -6.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 49, -2.0F, -2.95F, -1.0F, 4, 5, 6, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.17F, 2.3374F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 27, -2.0F, -1.0F, -2.5F, 4, 2, 5, -0.01F, false));

        this.dorsalfin1 = new AdvancedModelRenderer(this);
        this.dorsalfin1.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.body2.addChild(dorsalfin1);
        this.setRotateAngle(dorsalfin1, 0.6109F, 0.0F, 0.0F);
        this.dorsalfin1.cubeList.add(new ModelBox(dorsalfin1, 41, 31, -0.5F, -0.5F, 0.0F, 1, 2, 4, 0.0F, false));
        this.dorsalfin1.cubeList.add(new ModelBox(dorsalfin1, 24, 17, 0.0F, -1.25F, -1.0F, 0, 3, 7, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 20, 50, -2.0F, -2.0F, -1.0F, 4, 4, 5, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 38, -2.0F, 0.0F, 0.0F, 4, 1, 4, -0.02F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 2.9483F, -0.0849F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 0, -1.5F, -1.0F, 0.0F, 4, 1, 4, -0.02F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.75F);
        this.body3.addChild(body4);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.8843F, 3.4422F);
        this.body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.8727F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 38, 42, -1.5F, -1.5F, -0.5F, 3, 1, 2, -0.02F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.75F, 2.0F);
        this.body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 22, 41, -1.5F, 1.75F, -2.5F, 3, 1, 3, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -2.7904F, 2.1134F);
        this.body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.6545F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 43, -1.5F, 0.0417F, -0.0455F, 3, 1, 2, -0.02F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.5F, 1.75F);
        this.body4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 40, 14, -1.5F, -2.25F, -2.5F, 3, 4, 3, -0.01F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 37, 24, -1.5F, -1.25F, -2.5F, 3, 3, 4, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 46, -1.5F, -0.875F, 1.15F, 3, 2, 1, -0.01F, false));

        this.analfin = new AdvancedModelRenderer(this);
        this.analfin.setRotationPoint(0.0F, 1.7745F, 2.4148F);
        this.body4.addChild(analfin);
        this.setRotateAngle(analfin, -0.6545F, 0.0F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -2.2745F, -0.6648F);
        this.analfin.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 29, 9, 0.0F, 0.25F, -0.5F, 0, 3, 5, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 16, 0, -0.5F, 0.5F, 0.5F, 1, 2, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.5F, 2.25F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.1309F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -1.5653F, 4.5043F);
        this.body5.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3054F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 31, 42, -1.0F, -1.0F, -3.75F, 2, 2, 3, -0.02F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -1.5653F, 3.5043F);
        this.body5.addChild(body6);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.7024F, 1.5649F);
        this.body6.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.5672F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 28, 0, -0.5F, -0.75F, -2.0F, 1, 1, 3, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, -1.25F, 2.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 0, 3, 0.0F, -2.1F, -3.75F, 0, 7, 8, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.7378F, 1.1174F);
        this.body7.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.48F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 8, 24, -0.5F, -0.375F, -1.5F, 1, 1, 3, 0.0F, false));

        this.dorsalfin2 = new AdvancedModelRenderer(this);
        this.dorsalfin2.setRotationPoint(0.0F, -2.7F, 0.0F);
        this.body3.addChild(dorsalfin2);
        this.setRotateAngle(dorsalfin2, 0.5672F, 0.0F, 0.0F);
        this.dorsalfin2.cubeList.add(new ModelBox(dorsalfin2, 0, 26, -0.5F, -0.5F, 0.0F, 1, 4, 6, 0.0F, false));
        this.dorsalfin2.cubeList.add(new ModelBox(dorsalfin2, 0, 10, 0.0F, -1.25F, 1.0F, 0, 6, 8, 0.0F, false));

        this.pelvicfins2 = new AdvancedModelRenderer(this);
        this.pelvicfins2.setRotationPoint(-2.2F, 1.375F, 2.75F);
        this.body3.addChild(pelvicfins2);
        this.setRotateAngle(pelvicfins2, -0.6392F, 0.8908F, -0.4741F);
        this.pelvicfins2.cubeList.add(new ModelBox(pelvicfins2, 41, 45, -3.0F, -1.625F, 0.0F, 4, 3, 0, 0.0F, true));

        this.pelvicfins1 = new AdvancedModelRenderer(this);
        this.pelvicfins1.setRotationPoint(2.2F, 1.375F, 2.75F);
        this.body3.addChild(pelvicfins1);
        this.setRotateAngle(pelvicfins1, -0.6392F, -0.8908F, 0.4741F);
        this.pelvicfins1.cubeList.add(new ModelBox(pelvicfins1, 41, 45, -1.0F, -1.625F, 0.0F, 4, 3, 0, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.rotateAngleX = (float) Math.toRadians(0);
        this.body.offsetX = -0.027F;
        this.body.offsetY = -0.15F;
        this.body.offsetZ = 0.07F;
        this.body.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
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
        this.body.offsetY = 1.7F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5};
        float speed = 0.35F;
        if (!e.isInWater()) {
            speed = 0.6F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.5F, -3, f2, 1);
            this.swing(body, speed, 0.2F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), (float)Math.toRadians(10), true, 0, -0.2F, f2, 1);
            this.walk(pectorafin1, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectorafin1, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectorafin2, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectorafin2, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pelvicfins1, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pelvicfins1, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pelvicfins2, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pelvicfins2, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 1.33F;
                this.body.offsetX = -0.7F;
            }
        }
    }
}
