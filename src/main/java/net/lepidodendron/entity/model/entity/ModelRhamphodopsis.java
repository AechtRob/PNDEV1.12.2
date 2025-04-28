package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelRhamphodopsis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer forehead;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer RPectoral;
    private final AdvancedModelRenderer RPectoral2;
    private final AdvancedModelRenderer RPelvic;
    private final AdvancedModelRenderer RPelvic2;

    public ModelRhamphodopsis() {
        this.textureWidth = 34;
        this.textureHeight = 31;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 22.0F, 0.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.1F, -2.0F);
        this.Root.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 11, 25, -1.0F, 0.12F, -3.98F, 2, 2, 2, -0.02F, false));
        this.Head.cubeList.add(new ModelBox(Head, 24, 28, -1.0F, -0.5F, -4.25F, 2, 1, 1, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 7, 10, 0.01F, -2.9F, -0.7F, 0, 1, 1, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 21, 21, -1.0F, -1.9F, -2.0F, 2, 4, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, 2.1F, -2.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.5411F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 8, 1.5F, -1.02F, 0.25F, 3, 1, 1, -0.01F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 0, 0.0F, -1.02F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 2.1F, -2.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.5411F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 8, -4.5F, -1.02F, 0.25F, 3, 1, 1, -0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 0, -2.0F, -1.02F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.9F, -1.5F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.5672F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, -2.65F, 0.05F, 1, 3, 1, 0.0F, false));

        this.forehead = new AdvancedModelRenderer(this);
        this.forehead.setRotationPoint(0.0F, 0.95F, -3.95F);
        this.Head.addChild(forehead);
        this.setRotateAngle(forehead, -0.48F, 0.0F, 0.0F);
        this.forehead.cubeList.add(new ModelBox(forehead, 0, 27, -1.0F, -1.0F, -1.3F, 2, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.0F, -1.3F);
        this.forehead.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6109F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 11, -1.0F, -3.0F, 0.0F, 2, 3, 2, -0.03F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.25F, 0.95F);
        this.forehead.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.0436F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 26, 17, -1.0F, -0.5F, -2.0F, 2, 1, 2, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.25F, -0.3F, -2.0F);
        this.Jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1828F, -0.3006F, 0.0547F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 10, 0.0F, -0.7F, 0.1F, 0, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.25F, -0.3F, -2.0F);
        this.Jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1828F, 0.3006F, -0.0547F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 10, 0.0F, -0.7F, 0.1F, 0, 1, 2, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Root.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -1.5F, -2.0F, 0.0F, 3, 4, 5, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 0, 0.0F, -1.65F, 0.0F, 0, 2, 5, 0.0F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.5F, 5.0F);
        this.Body.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 13, 13, -1.0F, -1.48F, 0.0F, 2, 3, 4, 0.0F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 7, 10, 0.0F, -2.5F, 1.0F, 0, 2, 3, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.5F, 4.0F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 12, 5, -0.5F, -0.97F, 0.0F, 1, 2, 5, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 17, 27, 0.0F, -1.97F, 0.0F, 0, 1, 3, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 20, -0.5F, -0.5F, -0.02F, 1, 1, 5, -0.01F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 10, 0.0F, -0.49F, -0.02F, 0, 3, 6, 0.0F, false));

        this.RPectoral = new AdvancedModelRenderer(this);
        this.RPectoral.setRotationPoint(-1.5F, 1.75F, -0.25F);
        this.Body.addChild(RPectoral);
        this.setRotateAngle(RPectoral, -0.0252F, 0.523F, -0.0504F);
        this.RPectoral.cubeList.add(new ModelBox(RPectoral, 8, 21, -3.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, false));

        this.RPectoral2 = new AdvancedModelRenderer(this);
        this.RPectoral2.setRotationPoint(1.5F, 1.75F, -0.25F);
        this.Body.addChild(RPectoral2);
        this.setRotateAngle(RPectoral2, -0.0252F, -0.523F, 0.0504F);
        this.RPectoral2.cubeList.add(new ModelBox(RPectoral2, 8, 21, 0.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, true));

        this.RPelvic = new AdvancedModelRenderer(this);
        this.RPelvic.setRotationPoint(-1.5F, 1.75F, 3.5F);
        this.Body.addChild(RPelvic);
        this.setRotateAngle(RPelvic, -0.0308F, 0.7847F, -0.0596F);
        this.RPelvic.cubeList.add(new ModelBox(RPelvic, 12, 0, -3.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, false));

        this.RPelvic2 = new AdvancedModelRenderer(this);
        this.RPelvic2.setRotationPoint(1.5F, 1.75F, 3.5F);
        this.Body.addChild(RPelvic2);
        this.setRotateAngle(RPelvic2, -0.0308F, -0.7847F, 0.0596F);
        this.RPelvic2.cubeList.add(new ModelBox(RPelvic2, 12, 0, 0.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, true));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Root.rotateAngleY = (float) Math.toRadians(90);
        this.Root.offsetY = -0.21F;
        this.Root.offsetX = -0.03F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(cube_r1, 0.0F, -0.5411F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.5411F, 0.0F);
        this.setRotateAngle(cube_r3, -0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(forehead, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.1828F, -0.3006F, 0.0547F);
        this.setRotateAngle(cube_r6, -0.1828F, 0.3006F, -0.0547F);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(RPectoral, -0.0252F, 0.523F, -0.0504F);
        this.setRotateAngle(RPectoral2, -0.0252F, -0.523F, 0.0504F);
        this.setRotateAngle(RPelvic, -0.0308F, 0.7847F, -0.0596F);
        this.setRotateAngle(RPelvic2, -0.0308F, -0.7847F, 0.0596F);
        this.Root.rotateAngleY = (float) Math.toRadians(90);
        this.Root.offsetY = -0.2F;
        this.Root.render(0.01F);
        resetToDefaultPose();

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Root.offsetY = -2.0F;
        this.Root.offsetX = 1.2F;
        this.Root.offsetZ = 2.0F;
        this.Root.rotateAngleY = (float)Math.toRadians(120);
        this.Root.rotateAngleX = (float)Math.toRadians(0);
        this.Root.rotateAngleZ = (float)Math.toRadians(0);
        this.Root.scaleChildren = true;
        float scaler = 4.0F;
        this.Root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Root, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(cube_r1, 0.0F, -0.5411F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.5411F, 0.0F);
        this.setRotateAngle(cube_r3, -0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(forehead, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.1828F, -0.3006F, 0.0547F);
        this.setRotateAngle(cube_r6, -0.1828F, 0.3006F, -0.0547F);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(RPectoral, -0.0252F, 0.523F, -0.0504F);
        this.setRotateAngle(RPectoral2, -0.0252F, -0.523F, 0.0504F);
        this.setRotateAngle(RPelvic, -0.0308F, 0.7847F, -0.0596F);
        this.setRotateAngle(RPelvic2, -0.0308F, -0.7847F, 0.0596F);
        //End of pose, now render the model:
        this.Root.render(f);
        //Reset rotations, positions and sizing:
        this.Root.setScale(1.0F, 1.0F, 1.0F);
        this.Root.scaleChildren = false;
        resetToDefaultPose();

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
        AdvancedModelRenderer[] fishTail = {this.Tail, this.Tail2, this.Tail3};

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
            this.swing(Root, speed, 0.25F, true, 0, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.2F, f2, 1);
            //this.walk(RPectoral2, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(RPectoral2, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            //this.walk(RPectoral, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(RPectoral, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(RPelvic2, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(RPelvic2, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(RPelvic, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(RPelvic, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);

            if (!e.isInWater()) {
                this.Root.offsetY = -0.1F;
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            }
        }
    }
}
