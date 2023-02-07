package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelKujdanowiaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer spike;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer spike2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftfrontfin;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer rightfrontfin;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer leftbackfin;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer rightbackfin;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail5;

    public ModelKujdanowiaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.7843F, -4.7385F);
        this.main.cubeList.add(new ModelBox(main, 16, 0, -3.0F, -0.6093F, -0.4115F, 6, 3, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 16, 17, -2.5F, 1.8907F, -0.2865F, 5, 1, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 3, 1.1F, -0.2593F, -4.2365F, 1, 1, 1, 0.0F, true));
        this.main.cubeList.add(new ModelBox(main, 0, 3, -2.1F, -0.2593F, -4.2365F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -0.0343F, 4.9885F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 29, -4.5F, -2.675F, -2.55F, 7, 5, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 1.5618F, -2.5334F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.384F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 26, -3.0F, -1.9886F, -1.0302F, 4, 1, 1, -0.001F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 23, -3.0F, -0.9886F, -2.0302F, 4, 1, 2, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 2.2157F, 0.3635F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 5, -3.5F, -2.0F, -2.0F, 5, 1, 2, -0.001F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 31, 37, -3.5F, -1.0F, -3.0F, 5, 1, 3, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -0.9531F, -0.6935F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 36, -3.5F, -0.45F, -2.375F, 5, 2, 3, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 37, -3.0F, -0.45F, -4.375F, 4, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, -4.3323F, 5.0312F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5541F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 41, -3.5F, 0.0373F, -0.0144F, 5, 3, 2, 0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -2.4946F, 4.8151F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5454F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 0, -3.5F, -1.5F, -1.9F, 5, 2, 3, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -0.6093F, 1.3635F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4058F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 9, -4.0F, -1.675F, -2.575F, 6, 3, 5, 0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.4345F, 2.0639F, -0.2395F);
        this.main.addChild(jaw);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.8845F, -0.7835F, -2.4695F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.384F, -0.2182F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 18, 0.15F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0155F, -0.7835F, -2.4695F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.384F, 0.2182F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 18, -0.15F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5655F, -0.3271F, -2.2439F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.384F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 46, -2.5F, -0.4886F, -2.0302F, 3, 1, 2, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5655F, 0.3268F, 0.6531F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 14, 32, -3.0F, -0.5F, -3.075F, 4, 1, 3, 0.0F, false));

        this.spike = new AdvancedModelRenderer(this);
        this.spike.setRotationPoint(2.9562F, 1.0407F, 2.7309F);
        this.main.addChild(spike);
        this.setRotateAngle(spike, 0.0F, -0.2618F, 0.0F);
        this.spike.cubeList.add(new ModelBox(spike, 0, 44, -0.9562F, -1.0F, -0.8924F, 3, 2, 3, 0.0F, false));
        this.spike.cubeList.add(new ModelBox(spike, 36, 46, 2.0438F, -0.5F, 0.1076F, 2, 1, 2, 0.0F, false));
        this.spike.cubeList.add(new ModelBox(spike, 40, 7, 4.0438F, -0.5F, 1.1076F, 2, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.0438F, 0.0F, -0.8924F);
        this.spike.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.4581F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 5, 0.0F, -0.5F, 0.0F, 6, 1, 1, 0.01F, false));

        this.spike2 = new AdvancedModelRenderer(this);
        this.spike2.setRotationPoint(-2.9562F, 1.0407F, 2.7309F);
        this.main.addChild(spike2);
        this.setRotateAngle(spike2, 0.0F, 0.2618F, 0.0F);
        this.spike2.cubeList.add(new ModelBox(spike2, 38, 41, -2.0438F, -1.0F, -0.8924F, 3, 2, 3, 0.0F, true));
        this.spike2.cubeList.add(new ModelBox(spike2, 28, 46, -4.0438F, -0.5F, 0.1076F, 2, 1, 2, 0.0F, true));
        this.spike2.cubeList.add(new ModelBox(spike2, 28, 26, -6.0438F, -0.5F, 1.1076F, 2, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.0438F, 0.0F, -0.8924F);
        this.spike2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.4581F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 14, -6.0F, -0.5F, 0.0F, 6, 1, 1, 0.01F, true));

        this.leftfrontfin = new AdvancedModelRenderer(this);
        this.leftfrontfin.setRotationPoint(3.125F, 2.1157F, 4.6135F);
        this.main.addChild(leftfrontfin);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5653F, -0.197F, -1.125F);
        this.leftfrontfin.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1446F, -0.27F, 0.4996F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, 0.25F, 0.0F, -0.5F, 6, 0, 5, 0.0F, false));

        this.rightfrontfin = new AdvancedModelRenderer(this);
        this.rightfrontfin.setRotationPoint(-3.125F, 2.1157F, 4.6135F);
        this.main.addChild(rightfrontfin);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5653F, -0.197F, -1.125F);
        this.rightfrontfin.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1446F, 0.27F, -0.4996F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -6.25F, 0.0F, -0.5F, 6, 0, 5, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(2.0F, 2.2907F, 2.7385F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 12, 24, -5.0F, -4.0F, 2.0F, 6, 4, 4, -0.002F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -4.5F, 4.5F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3491F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 39, -3.0F, -0.6F, -1.5F, 4, 2, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-2.0F, -3.1348F, 6.0165F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 32, -2.5F, -0.8652F, -0.0165F, 5, 3, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, 3.1348F, -0.0165F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2487F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 33, 9, -3.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, -1.7411F, 1.0275F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.5061F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 14, 2, -1.5F, -0.175F, -1.8F, 1, 1, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.0F, -0.8771F, 3.4261F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.9774F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, -1.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, -0.8652F, 1.9835F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1484F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 32, 24, -3.0F, -0.225F, -2.075F, 4, 1, 4, 0.0F, false));

        this.leftbackfin = new AdvancedModelRenderer(this);
        this.leftbackfin.setRotationPoint(2.5265F, 1.7927F, 1.2819F);
        this.tail.addChild(leftbackfin);
        this.setRotateAngle(leftbackfin, 0.0F, 0.0F, -0.9599F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.6013F, -0.2984F);
        this.leftbackfin.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.4363F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 16, 14, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.rightbackfin = new AdvancedModelRenderer(this);
        this.rightbackfin.setRotationPoint(-2.5265F, 1.7927F, 1.2819F);
        this.tail.addChild(rightbackfin);
        this.setRotateAngle(rightbackfin, 0.0F, 0.0F, 0.9599F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.6013F, -0.2984F);
        this.rightbackfin.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.4363F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 16, 14, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5679F, 3.6F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 32, 17, -2.0F, -1.433F, 0.3835F, 4, 2, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 22, 43, 0.0F, -3.433F, 2.3835F, 0, 3, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, 1.567F, 0.3835F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2531F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 28, 20, -1.0F, 0.0F, 1.0F, 0, 2, 4, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 10, 41, -2.5F, -1.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.5805F, 4.3169F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 44, 16, -1.5F, -0.8525F, 0.0666F, 3, 1, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.0F, 1.1475F, 0.0666F);
        this.tail3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2051F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 28, -2.5F, -1.0F, 0.0F, 3, 1, 3, -0.001F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.2546F, 3.2238F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 45, 7, -1.0F, -0.598F, -0.1572F, 2, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, 1.402F, -3.1572F);
        this.tail4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2051F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 46, 28, -2.0F, -1.0F, 3.0F, 2, 1, 2, -0.001F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.098F, 2.8428F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 10, 0.0F, -6.0F, 0.0F, 0, 10, 8, 0.0F, false));

        updateDefaultPose();
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

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] fishfinL = {this.leftfrontfin};
        AdvancedModelRenderer[] fishfinR = {this.rightfrontfin};

        float speed = 0.3F;
        float taildegree = 0.17F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.09F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if(e.isInWater()) {
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, taildegree, -2.33, f2, 1);
            }
            this.chainFlap(fishfinL, speed, -0.15F, -3, f2, 1);
            this.chainWave(fishfinL, speed, 0.15F, -3, f2, 1);
            this.chainFlap(fishfinR, speed, 0.15F, -3, f2, 1);
            this.chainWave(fishfinR, speed, 0.15F, -3, f2, 1);
            this.swing(main, speed, 0.2F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0.20F, -0.2F, f2, 1);
            this.walk(leftbackfin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(leftbackfin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.walk(rightbackfin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(rightbackfin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);


            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.chainSwing(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
