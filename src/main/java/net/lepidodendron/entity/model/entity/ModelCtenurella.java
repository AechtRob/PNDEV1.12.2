package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelCtenurella extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;

    public ModelCtenurella() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.1414F, -0.9059F);
        this.main.cubeList.add(new ModelBox(main, 10, 23, -1.0F, -2.3914F, -4.0941F, 2, 2, 2, 0.001F, false));
        this.main.cubeList.add(new ModelBox(main, 22, 0, -1.0F, -2.3914F, -5.8441F, 2, 1, 2, -0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.6526F, -4.2166F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 23, -1.0F, 1.475F, 0.25F, 2, 2, 3, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 10, -1.1F, -0.2F, -0.75F, 1, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 10, 0.1F, -0.2F, -0.75F, 1, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, -0.525F, -2.75F, 2, 2, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.7745F, -5.4931F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.48F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.0F, -0.575F, -2.225F, 0, 2, 3, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.3998F, -4.0919F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 10, 8, -1.5F, -1.0F, 2.0F, 3, 2, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 16, 0.0F, -5.55F, 2.675F, 0, 3, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.5F, 4.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 10, -1.5F, -1.05F, -1.625F, 3, 3, 4, -0.001F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-1.5F, 0.4F, 3.45F);
        this.body.addChild(frontrightfin);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.frontrightfin.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.6109F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 0, -5.125F, 0.0F, -1.2F, 6, 0, 3, 0.0F, true));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(1.5F, 0.4F, 3.45F);
        this.body.addChild(frontleftfin);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.frontleftfin.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.6109F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 7, 0, -0.875F, 0.0F, -1.2F, 6, 0, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.8536F, 5.9675F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 17, -1.0F, -0.3964F, 0.0325F, 2, 2, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.8964F, 2.0325F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 14, -1.0F, -0.7F, -2.0F, 2, 2, 4, -0.01F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.0F, 1.0286F, 3.1825F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, 0.6545F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.1361F, 0.0F, 1.5996F);
        this.backleftfin.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0436F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.0F, 0.025F, -0.65F, 1, 0, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 0.0F, 0.5F);
        this.backleftfin.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.48F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 3, -2.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-1.0F, 1.0286F, 3.1825F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, -0.6545F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.1361F, 0.0F, 1.5996F);
        this.backrightfin.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.0436F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -1.0F, 0.025F, -0.65F, 1, 0, 3, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 0.0F, 0.5F);
        this.backrightfin.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.48F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 3, -2.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.441F, 4.0642F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 3, -1.0F, 0.2946F, -0.0317F, 2, 1, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 8, 0.0F, -1.7054F, 1.9683F, 0, 2, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.4762F, 0.4045F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.1868F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 17, -0.5F, -1.825F, -0.125F, 1, 2, 1, -0.02F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.6599F, 0.1668F);
        this.tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2269F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 10, -0.5F, 0.1255F, -0.2271F, 1, 1, 4, -0.001F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5446F, 3.9683F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 18, 19, -0.5F, -0.25F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 18, 11, 0.0F, -2.25F, 0.0F, 0, 2, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 1, 0.0F, -1.5F, 0.0F, 0, 2, 7, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.3998F, -4.0919F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 22, 17, -1.0F, 0.0085F, -0.8772F, 2, 1, 1, -0.002F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.75F, 0.1947F, -0.9075F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4712F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.0F, -0.525F, -0.65F, 0, 1, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 1.5F, -0.525F, -0.65F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.0085F, -0.8772F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2749F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 8, -1.0F, -1.0F, -1.0F, 2, 1, 1, -0.01F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.21F;
        this.main.offsetX = -0.04F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0F, 0.6109F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, -0.6109F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, 0.6545F);
        this.setRotateAngle(cube_r7, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, -0.48F, 0.0F);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, -0.6545F);
        this.setRotateAngle(cube_r9, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0F, 0.48F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r11, -1.1868F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(jaw, 1.2217F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.4712F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.2749F, 0.0F, 0.0F);
        this.main.offsetY = -0.3F;
        this.main.offsetZ = 0.01F;
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {

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
        AdvancedModelRenderer[] fishTail = {this.tail2, this.tail3, this.tail4};

        float speed = 0.3F;
        float taildegree = 0.2F;

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
            speed = 0.095F;
            taildegree = 0.11F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -1.5, f2, 0.8F);
            this.chainSwing(fishTail, speed, taildegree, -1, f2, 0.8F);
            this.swing(main, speed, 0.25F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.2F, f2, 1);
            this.walk(frontleftfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(frontrightfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(backleftfin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backleftfin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(backrightfin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backrightfin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);

            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.1F;
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            }
        }
    }
}
