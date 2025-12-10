package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelNectocaris extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightantenna;
    private final AdvancedModelRenderer leftantenna;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer rightfin1;
    private final AdvancedModelRenderer leftfin1;
    private final AdvancedModelRenderer rightfin2;
    private final AdvancedModelRenderer leftfin2;
    private final AdvancedModelRenderer rightfin3;
    private final AdvancedModelRenderer leftfin3;
    private final AdvancedModelRenderer rightfin4;
    private final AdvancedModelRenderer leftfin4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer rightfin5;
    private final AdvancedModelRenderer leftfin5;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer rightfin6;
    private final AdvancedModelRenderer leftfin6;
    private final AdvancedModelRenderer rightfin7;
    private final AdvancedModelRenderer leftfin7;

    public ModelNectocaris() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5F, -6.0F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 8, 12, -1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 12, 2, -1.5F, -0.5F, -2.0F, 3, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.rightantenna = new AdvancedModelRenderer(this);
        this.rightantenna.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.head.addChild(rightantenna);
        this.setRotateAngle(rightantenna, 0.0F, 0.1309F, 0.0F);
        this.rightantenna.cubeList.add(new ModelBox(rightantenna, 0, 0, -3.0F, 0.0F, -6.0F, 3, 0, 6, 0.0F, false));

        this.leftantenna = new AdvancedModelRenderer(this);
        this.leftantenna.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.head.addChild(leftantenna);
        this.setRotateAngle(leftantenna, 0.0F, -0.1309F, 0.0F);
        this.leftantenna.cubeList.add(new ModelBox(leftantenna, 0, 0, 0.0F, 0.0F, -6.0F, 3, 0, 6, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.5F, -6.0F);
        this.main.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 12, 0, -1.5F, -0.5F, 0.0F, 3, 1, 1, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 6, -2.0F, -0.5F, 1.0F, 4, 1, 5, 0.0F, false));

        this.rightfin1 = new AdvancedModelRenderer(this);
        this.rightfin1.setRotationPoint(-1.5F, 0.0F, 0.5F);
        this.body1.addChild(rightfin1);
        this.rightfin1.cubeList.add(new ModelBox(rightfin1, 12, 6, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.leftfin1 = new AdvancedModelRenderer(this);
        this.leftfin1.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.body1.addChild(leftfin1);
        this.leftfin1.cubeList.add(new ModelBox(leftfin1, 12, 6, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.rightfin2 = new AdvancedModelRenderer(this);
        this.rightfin2.setRotationPoint(-2.0F, 0.0F, 2.0F);
        this.body1.addChild(rightfin2);
        this.rightfin2.cubeList.add(new ModelBox(rightfin2, 0, 8, -1.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.leftfin2 = new AdvancedModelRenderer(this);
        this.leftfin2.setRotationPoint(2.0F, 0.0F, 2.0F);
        this.body1.addChild(leftfin2);
        this.leftfin2.cubeList.add(new ModelBox(leftfin2, 0, 8, 0.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, true));

        this.rightfin3 = new AdvancedModelRenderer(this);
        this.rightfin3.setRotationPoint(-2.0F, 0.0F, 4.0F);
        this.body1.addChild(rightfin3);
        this.rightfin3.cubeList.add(new ModelBox(rightfin3, 0, 6, -1.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.leftfin3 = new AdvancedModelRenderer(this);
        this.leftfin3.setRotationPoint(2.0F, 0.0F, 4.0F);
        this.body1.addChild(leftfin3);
        this.leftfin3.cubeList.add(new ModelBox(leftfin3, 0, 6, 0.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, true));

        this.rightfin4 = new AdvancedModelRenderer(this);
        this.rightfin4.setRotationPoint(-2.0F, 0.0F, 5.5F);
        this.body1.addChild(rightfin4);
        this.rightfin4.cubeList.add(new ModelBox(rightfin4, 2, 10, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.leftfin4 = new AdvancedModelRenderer(this);
        this.leftfin4.setRotationPoint(2.0F, 0.0F, 5.5F);
        this.body1.addChild(leftfin4);
        this.leftfin4.cubeList.add(new ModelBox(leftfin4, 2, 10, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 12, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.rightfin5 = new AdvancedModelRenderer(this);
        this.rightfin5.setRotationPoint(-1.5F, 0.0F, 1.0F);
        this.body2.addChild(rightfin5);
        this.rightfin5.cubeList.add(new ModelBox(rightfin5, 2, 3, -1.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.leftfin5 = new AdvancedModelRenderer(this);
        this.leftfin5.setRotationPoint(1.5F, 0.0F, 1.0F);
        this.body2.addChild(leftfin5);
        this.leftfin5.cubeList.add(new ModelBox(leftfin5, 2, 3, 0.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 3, -0.5F, -0.5F, 1.0F, 1, 1, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 12, 4, -1.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));

        this.rightfin6 = new AdvancedModelRenderer(this);
        this.rightfin6.setRotationPoint(-1.0F, 0.0F, 0.5F);
        this.body3.addChild(rightfin6);
        this.rightfin6.cubeList.add(new ModelBox(rightfin6, 0, 10, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.leftfin6 = new AdvancedModelRenderer(this);
        this.leftfin6.setRotationPoint(1.0F, 0.0F, 0.5F);
        this.body3.addChild(leftfin6);
        this.leftfin6.cubeList.add(new ModelBox(leftfin6, 0, 10, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.rightfin7 = new AdvancedModelRenderer(this);
        this.rightfin7.setRotationPoint(-0.5F, 0.0F, 2.0F);
        this.body3.addChild(rightfin7);
        this.rightfin7.cubeList.add(new ModelBox(rightfin7, 2, 0, -1.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.leftfin7 = new AdvancedModelRenderer(this);
        this.leftfin7.setRotationPoint(0.5F, 0.0F, 2.0F);
        this.body3.addChild(leftfin7);
        this.leftfin7.cubeList.add(new ModelBox(leftfin7, 2, 0, 0.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -2.6F;
        this.main.offsetX = -1.0F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 4.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = -0.1F;
        this.main.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
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
            this.main.offsetY = -0.18F;
        }


        AdvancedModelRenderer[] fishTail = {this.body1, this.body2, this.body3};

        this.chainSwing(fishTail, speed, tailVdegree * 0.3f, -0.5F, f2, 0.5F);
        this.chainWave(fishTail, speed, tailHdegree, -2.5, f2, tailSwing);

        this.swing(leftantenna, speed * 3F, 0.3F, true, 0, 0, f2, 0.5F);
        this.swing(rightantenna, speed * 3F, -0.3F, true, 0, 0, f2, 0.5F);

        float feedModifier = 1;
        if (f3 == 0.0) {
            feedModifier = 0.15F;
        }
        float degreeFin = 0.285F;
        this.flap(leftfin1, 0.5F, -degreeFin*0.2F, false, 2.0F, 0, f2, 0.7F);
        this.flap(rightfin1, 0.5F, degreeFin*0.2F, false, 2.0F, 0, f2, 0.7F);
        this.flap(leftfin2, 0.5F, -degreeFin, false, 2.5F, -0.4F, f2, 0.7F);
        this.flap(rightfin2, 0.5F, degreeFin, false, 2.5F, 0.4F, f2, 0.7F);
        this.flap(leftfin3, 0.5F, -degreeFin, false, 3.0F, -0.4F, f2, 0.7F);
        this.flap(rightfin3, 0.5F, degreeFin, false, 3.0F, 0.4F, f2, 0.7F);
        this.flap(leftfin4, 0.5F, -degreeFin, false, 3.5F, -0.4F, f2, 0.7F);
        this.flap(rightfin4, 0.5F, degreeFin, false, 3.5F, 0.4F, f2, 0.7F);
        this.flap(leftfin5, 0.5F, -degreeFin, false, 4.0F, -0.4F, f2, 0.7F);
        this.flap(rightfin5, 0.5F, degreeFin, false, 4.0F, 0.4F, f2, 0.7F);
        this.flap(leftfin6, 0.5F, -degreeFin, false, 4.5F, -0.4F, f2, 0.7F);
        this.flap(rightfin6, 0.5F, degreeFin, false, 4.5F, 0.4F, f2, 0.7F);
        this.flap(leftfin7, 0.5F, -degreeFin, false, 5.0F, -0.4F, f2, 0.7F);
        this.flap(rightfin7, 0.5F, degreeFin, false, 5.0F, 0.4F, f2, 0.7F);

        this.chainSwing(fishTail, speed * 4F, tailHdegree * 3F, -3, f2, 1);
        this.chainWave(fishTail, speed * 4F, tailVdegree * 3F, -3, f2, 1);
        
        if (!e.isInWater()) {
            //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
            //this.timorebestia.offsetY = 1.2F - 1.18F;
            this.bob(main, -speed * 3F, 2F, false, f2, 1);
            this.chainSwing(fishTail, speed * 4F, tailHdegree * 3F, -3, f2, 1);
            this.chainWave(fishTail, speed * 4F, tailVdegree * 3F, -3, f2, 1);
        }

    }
}