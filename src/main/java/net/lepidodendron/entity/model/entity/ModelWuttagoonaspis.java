package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraHolonema;
import net.lepidodendron.entity.EntityPrehistoricFloraWuttagoonaspis;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelWuttagoonaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
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
    private final AdvancedModelRenderer spike;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer spike2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer cube_r28;

    private ModelAnimator animator;


    public ModelWuttagoonaspis() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.1465F, -1.251F);
        this.main.cubeList.add(new ModelBox(main, 50, 0, -4.5F, -2.8965F, -3.749F, 2, 3, 5, -0.001F, false));
        this.main.cubeList.add(new ModelBox(main, 50, 0, 2.5F, -2.8965F, -3.749F, 2, 3, 5, -0.001F, true));
        this.main.cubeList.add(new ModelBox(main, 26, 18, -2.5F, -2.8965F, -6.749F, 5, 3, 8, 0.001F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 13, -3.5F, -0.2965F, -1.174F, 7, 1, 10, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.5F, -4.8965F, 1.251F, 9, 5, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -5.0715F, 6.876F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.096F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 41, -1.0F, -0.5F, -4.0F, 2, 1, 8, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.6965F, 5.326F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0524F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 0, -2.0F, -0.5F, -4.0F, 4, 1, 8, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -4.8965F, 1.251F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 24, -2.5F, 0.1F, -8.7F, 5, 3, 9, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.7035F, 8.826F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1396F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 4, -2.5F, -1.175F, 0.0F, 5, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.5F, -3.1465F, -1.749F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1571F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 48, -1.525F, -0.725F, -3.725F, 2, 2, 7, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 48, -7.475F, -0.725F, -3.725F, 2, 2, 7, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(5.3104F, -2.2245F, -0.8847F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0525F, 0.1876F, 0.0007F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 54, -1.0F, -0.7F, -2.3F, 2, 2, 4, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-5.3104F, -2.2245F, -0.8847F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0525F, -0.1876F, -0.0007F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 52, 54, -1.0F, -0.7F, -2.3F, 2, 2, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(4.3F, -0.8965F, -5.849F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.5629F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 54, -3.0328F, -2.0F, -0.0122F, 3, 3, 3, -0.002F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-4.3F, -0.8965F, -5.849F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.5629F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 54, 0.0328F, -2.0F, -0.0122F, 3, 3, 3, -0.002F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.5F, -0.8965F, -6.749F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 1.0908F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 16, -3.0F, -2.0F, 0.0F, 3, 3, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.5F, -0.8965F, -6.749F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -1.0908F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 16, 0.0F, -2.0F, 0.0F, 3, 3, 2, 0.0F, false));

        this.spike = new AdvancedModelRenderer(this);
        this.spike.setRotationPoint(-3.9373F, -0.6465F, -0.4251F);
        this.main.addChild(spike);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-4.1245F, -0.5F, 0.2202F);
        this.spike.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 1.5053F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 49, 9, -5.0392F, 0.0F, -0.0025F, 5, 1, 2, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.5127F, 0.0F, 0.7011F);
        this.spike.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -1.2174F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 51, 49, -1.4F, -0.5F, -2.55F, 3, 1, 4, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.4651F, -0.2F, -0.2107F);
        this.spike.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1396F, 0.9163F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 38, 49, -1.75F, -0.525F, -1.5F, 4, 1, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5373F, -0.5F, -3.1489F);
        this.spike.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.9163F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 29, -5.55F, 0.0F, -1.65F, 4, 1, 3, 0.0F, false));

        this.spike2 = new AdvancedModelRenderer(this);
        this.spike2.setRotationPoint(3.9373F, -0.6465F, -0.4251F);
        this.main.addChild(spike2);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(4.1245F, -0.5F, 0.2202F);
        this.spike2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -1.5053F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 49, 9, 0.0392F, 0.0F, -0.0025F, 5, 1, 2, -0.001F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.5127F, 0.0F, 0.7011F);
        this.spike2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 1.2174F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 51, 49, -1.6F, -0.5F, -2.55F, 3, 1, 4, -0.01F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.4651F, -0.2F, -0.2107F);
        this.spike2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1396F, -0.9163F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 49, -2.25F, -0.525F, -1.5F, 4, 1, 5, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5373F, -0.5F, -3.1489F);
        this.spike2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.9163F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 19, 29, 1.55F, 0.0F, -1.65F, 4, 1, 3, 0.0F, true));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-3.2077F, 0.2035F, 1.6269F);
        this.main.addChild(frontrightfin);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-4.0423F, -0.4F, 0.9741F);
        this.frontrightfin.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.6109F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 19, 13, -6.825F, 0.4F, -0.775F, 12, 0, 5, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(3.2077F, 0.2035F, 1.6269F);
        this.main.addChild(frontleftfin);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(4.0423F, -0.4F, 0.9741F);
        this.frontleftfin.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.6109F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 19, 13, -5.175F, 0.4F, -0.775F, 12, 0, 5, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.2965F, -0.924F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 10, 45, -2.0F, 0.0F, -5.25F, 4, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 9, -3.0F, 0.0F, -3.25F, 6, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.1994F, 9.3449F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 28, 29, -4.0F, -0.6972F, -0.0939F, 8, 4, 5, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -1.6972F, -0.0939F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1178F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 49, 24, -2.5F, 0.0F, 0.0F, 6, 1, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.4534F, 4.885F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 36, -3.0F, -1.1506F, 0.0211F, 6, 4, 5, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, -1.0008F, 2.3644F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0698F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 9, 0.5F, -3.35F, -0.475F, 0, 3, 4, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 49, 40, -1.5F, -0.35F, -2.475F, 4, 1, 5, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-3.25F, 2.3494F, 3.7711F);
        this.tail2.addChild(backrightfin);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.backrightfin.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.3927F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 22, 0, -2.7F, 0.0F, -0.775F, 6, 0, 4, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(3.25F, 2.3494F, 3.7711F);
        this.tail2.addChild(backleftfin);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.backleftfin.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.3927F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 22, 0, -3.3F, 0.0F, -0.775F, 6, 0, 4, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.8494F, 5.1211F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 44, 13, -2.5F, -2.0F, -0.1F, 5, 4, 5, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.2782F, 4.0423F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 49, 32, -1.5F, -1.7218F, -0.1423F, 3, 2, 6, -0.02F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, 0.0F, -4.7218F, 2.3577F, 0, 4, 4, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 2.2782F, 0.8577F);
        this.tail4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1789F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 13, 50, -1.0F, -2.125F, 0.025F, 2, 2, 5, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -1.1072F, 4.8609F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 27, 38, -1.0F, -0.6146F, -0.0031F, 2, 2, 8, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.5F, 1.3854F, 7.9969F);
        this.tail5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0698F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 17, 1.5F, 0.45F, -5.0F, 0, 2, 4, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 45, 1.0F, -0.55F, -8.0F, 1, 1, 8, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.2152F, 7.7283F);
        this.tail5.addChild(tail6);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.1006F, 0.2686F);
        this.tail6.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.48F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 17, 29, 0.0F, 0.175F, -0.575F, 0, 3, 9, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 38, 39, -0.5F, -0.825F, -0.575F, 1, 1, 9, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.1F;
        this.main.offsetY = -0F;
        this.main.offsetZ = 0.02F;
        this.main.render(0.01F);
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
        //this.headshield.offsetZ = -0.4F;
        //this.main.offsetY = 0.7F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        EntityPrehistoricFloraWuttagoonaspis wuttagoon = (EntityPrehistoricFloraWuttagoonaspis) e;
        float speed = 0.3F;
        float taildegree = 0.25F;
        float inwater = 1F;

        if (!e.isInWater()) {
            speed = 0.7F;
            inwater = 0.65F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        float bottomModifier = 1F;
        float swingModifier = 1F;
        float finDegreeZ = (float)Math.toRadians(25);
        float finDegreeY = (float)Math.toRadians(7.5);
        if (isAtBottom && !wuttagoon.getIsFast()) {
            //System.err.println("Animation at bottom");
            speed = 0.2F;
            taildegree = 0.23F;
            bottomModifier = 0.8F;
            swingModifier = 0.5F;
            finDegreeZ = (float)Math.toRadians(15);
            finDegreeY = (float)Math.toRadians(12.5);

            //this.bodylower.rotateAngleX = (float) Math.toRadians(-10);

        }



        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {


            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetX = 0.4F;
                this.chainWave(fishTail, speed*0.4F, 0.01F, -1, f2, 1);
                this.chainSwing(fishTail, speed*0.4F, 0.10F, -3, f2, 1);
                this.swing(main, speed * 0.4F, 0.1F * bottomModifier * swingModifier, true, 0, 0, f2, 1 * swingModifier);
            } else {

                this.chainWave(fishTail, speed * 0.5F * bottomModifier, 0.01F, -1, f2, 1);
                this.chainSwing(fishTail, speed * 0.5F * bottomModifier, taildegree * bottomModifier, -3, f2, 1);
                this.swing(main, speed * 0.5F * bottomModifier, 0.3F * bottomModifier * swingModifier, true, 0, 0, f2, 1 * swingModifier);
                if (isAtBottom && !wuttagoon.getIsFast()) {
                    this.walk(jaw, (float) (speed * 0.25), (float) Math.toRadians(25), true, 0.5F, -0.3F, f2, 1);
                } else {
                    this.walk(jaw, (float) (speed * 0.4), (float) Math.toRadians(15), true, 0.2F, -0.25F, f2, 1);
                }
                this.flap(frontleftfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeZ * inwater, true, -3F, 0, f2, 1 * inwater);
                this.swing(frontleftfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeY * inwater, true, -3F, 0, f2, 1 * inwater);
                this.flap(frontrightfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeZ * inwater, true, 0F, 0, f2, 1 * inwater);
                this.swing(frontrightfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeY * inwater, true, 0, 0, f2, 1 * inwater);

                this.flap(backleftfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), 0.15F * inwater, true, -0.1F, 0.1F, f2, 1 * inwater);
                this.swing(backleftfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), 0.1F * inwater, true, 0, 0, f2, 1 * inwater);
                this.flap(backrightfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), -0.15F * inwater, true, 0.1F, -0.1F, f2, 1 * inwater);
                this.swing(backrightfin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), -0.1F * inwater, true, 0, 0, f2, 1 * inwater);
            }
        }
    }


}
