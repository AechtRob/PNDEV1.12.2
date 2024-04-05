package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelTimorebestia extends AdvancedModelBase {
    private final AdvancedModelRenderer timorebestia;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer leftFin1;
    private final AdvancedModelRenderer rightFin1;
    private final AdvancedModelRenderer leftFin2;
    private final AdvancedModelRenderer rightFin2;
    private final AdvancedModelRenderer leftFin3;
    private final AdvancedModelRenderer rightFin3;
    private final AdvancedModelRenderer leftFin4;
    private final AdvancedModelRenderer rightFin4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer leftFin5;
    private final AdvancedModelRenderer rightFin5;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer leftFin6;
    private final AdvancedModelRenderer rightFin6;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer leftFin7;
    private final AdvancedModelRenderer rightFin7;
    private final AdvancedModelRenderer leftFin8;
    private final AdvancedModelRenderer rightFin8;

    public ModelTimorebestia() {
        this.textureWidth = 40;
        this.textureHeight = 33;

        this.timorebestia = new AdvancedModelRenderer(this);
        this.timorebestia.setRotationPoint(0.0F, 24.0F, 5.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.1402F, -10.1396F);
        this.timorebestia.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 28, 30, -0.5F, 0.3402F, -2.8814F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 19, -1.5F, -0.5598F, -3.8814F, 3, 1, 4, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 21, 0, -1.5F, 0.0402F, -3.8814F, 3, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -0.0598F, -4.3814F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.3491F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 19, -0.5F, -0.65F, 0.51F, 1, 1, 1, 0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -0.0598F, -4.3814F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.3491F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 19, -0.5F, -0.65F, 0.51F, 1, 1, 1, 0.01F, false));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.7F, 0.2402F, -3.7814F);
        this.head.addChild(leftAntenna);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.3F, 0.1F, -0.3F);
        this.leftAntenna.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 14, -0.44F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.1F, 0.0F, -3.3F);
        this.leftAntenna.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 11, -0.7F, 0.0F, -3.7F, 3, 0, 7, 0.0F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.7F, 0.2402F, -3.7814F);
        this.head.addChild(rightAntenna);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.3F, 0.1F, -0.3F);
        this.rightAntenna.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.1745F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 14, -0.56F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.1F, 0.0F, -3.3F);
        this.rightAntenna.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1745F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 11, -2.3F, 0.0F, -3.7F, 3, 0, 7, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.9333F, -10.0333F);
        this.timorebestia.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 27, 9, -2.0F, -1.0667F, -0.9876F, 4, 2, 2, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -3.0F, -1.0667F, 0.3124F, 6, 2, 8, 0.01F, false));

        this.leftFin1 = new AdvancedModelRenderer(this);
        this.leftFin1.setRotationPoint(-1.5F, 0.8333F, -0.8876F);
        this.body1.addChild(leftFin1);
        this.leftFin1.cubeList.add(new ModelBox(leftFin1, 29, 6, 3.0F, -0.9F, 0.2F, 2, 0, 2, 0.0F, false));

        this.rightFin1 = new AdvancedModelRenderer(this);
        this.rightFin1.setRotationPoint(1.5F, 0.8333F, -0.8876F);
        this.body1.addChild(rightFin1);
        this.rightFin1.cubeList.add(new ModelBox(rightFin1, 29, 6, -5.0F, -0.9F, 0.2F, 2, 0, 2, 0.0F, true));

        this.leftFin2 = new AdvancedModelRenderer(this);
        this.leftFin2.setRotationPoint(3.0F, -0.0667F, 2.3124F);
        this.body1.addChild(leftFin2);
        this.leftFin2.cubeList.add(new ModelBox(leftFin2, 30, 18, -0.5F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));

        this.rightFin2 = new AdvancedModelRenderer(this);
        this.rightFin2.setRotationPoint(-3.0F, -0.0667F, 2.3124F);
        this.body1.addChild(rightFin2);
        this.rightFin2.cubeList.add(new ModelBox(rightFin2, 30, 18, -1.5F, 0.0F, -1.0F, 2, 0, 2, 0.0F, true));

        this.leftFin3 = new AdvancedModelRenderer(this);
        this.leftFin3.setRotationPoint(3.0F, -0.0667F, 4.8124F);
        this.body1.addChild(leftFin3);
        this.leftFin3.cubeList.add(new ModelBox(leftFin3, 10, 28, -0.5F, 0.0F, -1.5F, 2, 0, 3, 0.0F, false));

        this.rightFin3 = new AdvancedModelRenderer(this);
        this.rightFin3.setRotationPoint(-3.0F, -0.0667F, 4.8124F);
        this.body1.addChild(rightFin3);
        this.rightFin3.cubeList.add(new ModelBox(rightFin3, 10, 28, -1.5F, 0.0F, -1.5F, 2, 0, 3, 0.0F, true));

        this.leftFin4 = new AdvancedModelRenderer(this);
        this.leftFin4.setRotationPoint(3.0F, -0.0667F, 7.3124F);
        this.body1.addChild(leftFin4);
        this.leftFin4.cubeList.add(new ModelBox(leftFin4, 19, 30, -0.5F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));

        this.rightFin4 = new AdvancedModelRenderer(this);
        this.rightFin4.setRotationPoint(-3.0F, -0.0667F, 7.3124F);
        this.body1.addChild(rightFin4);
        this.rightFin4.cubeList.add(new ModelBox(rightFin4, 19, 30, -1.5F, 0.0F, -1.0F, 2, 0, 2, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.5F, 0.0333F, 8.2333F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 17, 17, -2.5F, -0.8F, -0.921F, 4, 1, 4, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 14, 11, -2.5F, -0.1F, -0.921F, 4, 1, 4, 0.0F, false));

        this.leftFin5 = new AdvancedModelRenderer(this);
        this.leftFin5.setRotationPoint(1.5F, -0.1F, 1.579F);
        this.body2.addChild(leftFin5);
        this.leftFin5.cubeList.add(new ModelBox(leftFin5, 0, 30, -0.5F, 0.0F, -1.5F, 2, 0, 3, 0.0F, false));

        this.rightFin5 = new AdvancedModelRenderer(this);
        this.rightFin5.setRotationPoint(-2.5F, -0.1F, 1.579F);
        this.body2.addChild(rightFin5);
        this.rightFin5.cubeList.add(new ModelBox(rightFin5, 0, 30, -1.5F, 0.0F, -1.5F, 2, 0, 3, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(-0.5F, 0.0F, 3.1F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 23, 25, -1.5F, -0.4F, -1.021F, 3, 1, 3, 0.0F, false));

        this.leftFin6 = new AdvancedModelRenderer(this);
        this.leftFin6.setRotationPoint(1.5F, -0.1F, 0.979F);
        this.body3.addChild(leftFin6);
        this.leftFin6.cubeList.add(new ModelBox(leftFin6, 0, 0, 0.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.rightFin6 = new AdvancedModelRenderer(this);
        this.rightFin6.setRotationPoint(-1.5F, -0.1F, 0.979F);
        this.body3.addChild(rightFin6);
        this.rightFin6.cubeList.add(new ModelBox(rightFin6, 0, 0, -1.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.04F, 1.979F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 11, -1.0F, -0.44F, 0.0F, 2, 1, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 25, -1.5F, -0.44F, 1.0F, 3, 1, 3, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 13, 23, -1.5F, -0.14F, 4.0F, 3, 0, 2, 0.0F, false));

        this.leftFin7 = new AdvancedModelRenderer(this);
        this.leftFin7.setRotationPoint(1.0F, -0.14F, 1.0F);
        this.body4.addChild(leftFin7);
        this.leftFin7.cubeList.add(new ModelBox(leftFin7, 0, 3, 0.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.rightFin7 = new AdvancedModelRenderer(this);
        this.rightFin7.setRotationPoint(-1.0F, -0.14F, 1.0F);
        this.body4.addChild(rightFin7);
        this.rightFin7.cubeList.add(new ModelBox(rightFin7, 0, 3, -1.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, true));

        this.leftFin8 = new AdvancedModelRenderer(this);
        this.leftFin8.setRotationPoint(1.5F, -0.14F, 3.5F);
        this.body4.addChild(leftFin8);
        this.leftFin8.cubeList.add(new ModelBox(leftFin8, 30, 14, 0.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, false));

        this.rightFin8 = new AdvancedModelRenderer(this);
        this.rightFin8.setRotationPoint(-1.5F, -0.14F, 3.5F);
        this.body4.addChild(rightFin8);
        this.rightFin8.cubeList.add(new ModelBox(rightFin8, 30, 14, -1.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.timorebestia.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.timorebestia.render(0.01F);
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


        float speed = 0.4F * 0.2F;
        float tailVdegree = 0.25F * 0.2F;
        float tailHdegree = 0.0F * 0.2F;
        float tailSwing = 0.75F * 0.2F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.25F * 0.2F;
            tailVdegree = 0F;
            tailHdegree = 0.3F * 0.2F;
            tailSwing = 0.6F * 0.2F;
        }
        if (!e.isInWater()) {
            speed = 0.7F * 0.2F;
        } else {
            this.timorebestia.offsetY = -0.18F;
        }


        AdvancedModelRenderer[] fishTail = {this.body1, this.body2, this.body3, this.body4};


        this.chainWave(fishTail, speed, tailVdegree * 0.3f, -0.5F, f2, 0.5F);
        this.chainSwing(fishTail, speed, tailHdegree, -2.5, f2, tailSwing);

        //this.chainSwing(pincerL, speed * 3F, -0.1F, 0.5F, f2, 0.1F);
        //this.chainSwing(pincerR, speed *  3F, 0.1F, 0.5F, f2, 0.1F);
        this.swing(leftAntenna, speed * 3F, 0.3F, true, 0, 0, f2, 0.5F);
        this.swing(rightAntenna, speed * 3F, -0.3F, true, 0, 0, f2, 0.5F);

        float feedModifier = 1;
        if (f3 == 0.0) {
            feedModifier = 0.15F;
        }
        float degreeFin = 0.285F;
        this.flap(leftFin1, 0.5F, -degreeFin*0.2F, false, 2.0F, 0, f2, 0.7F);
        this.flap(rightFin1, 0.5F, degreeFin*0.2F, false, 2.0F, 0, f2, 0.7F);
        this.flap(leftFin2, 0.5F, -degreeFin, false, 2.5F, -0.4F, f2, 0.7F);
        this.flap(rightFin2, 0.5F, degreeFin, false, 2.5F, 0.4F, f2, 0.7F);
        this.flap(leftFin3, 0.5F, -degreeFin, false, 3.0F, -0.4F, f2, 0.7F);
        this.flap(rightFin3, 0.5F, degreeFin, false, 3.0F, 0.4F, f2, 0.7F);
        this.flap(leftFin4, 0.5F, -degreeFin, false, 3.5F, -0.4F, f2, 0.7F);
        this.flap(rightFin4, 0.5F, degreeFin, false, 3.5F, 0.4F, f2, 0.7F);
        this.flap(leftFin5, 0.5F, -degreeFin, false, 4.0F, -0.4F, f2, 0.7F);
        this.flap(rightFin5, 0.5F, degreeFin, false, 4.0F, 0.4F, f2, 0.7F);
        this.flap(leftFin6, 0.5F, -degreeFin, false, 4.5F, -0.4F, f2, 0.7F);
        this.flap(rightFin6, 0.5F, degreeFin, false, 4.5F, 0.4F, f2, 0.7F);
        this.flap(leftFin7, 0.5F, -degreeFin, false, 5.0F, -0.4F, f2, 0.7F);
        this.flap(rightFin7, 0.5F, degreeFin, false, 5.0F, 0.4F, f2, 0.7F);
        this.flap(leftFin8, 0.5F, -degreeFin, false, 5.5F, -0.4F, f2, 0.7F);
        this.flap(rightFin8, 0.5F, degreeFin, false, 5.5F, 0.4F, f2, 0.7F);
        this.chainWave(fishTail, speed * 4F, tailHdegree * 3F, -3, f2, 1);
        this.chainSwing(fishTail, speed * 4F, tailVdegree * 3F, -3, f2, 1);



        if (!e.isInWater()) {
            //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
            //this.timorebestia.offsetY = 1.2F - 1.18F;
            this.bob(timorebestia, -speed * 3F, 2F, false, f2, 1);
            this.chainWave(fishTail, speed * 4F, tailHdegree * 3F, -3, f2, 1);
            this.chainSwing(fishTail, speed * 4F, tailVdegree * 3F, -3, f2, 1);
        }

    }
}
