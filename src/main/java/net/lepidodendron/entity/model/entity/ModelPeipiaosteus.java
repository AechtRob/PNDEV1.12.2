package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelPeipiaosteus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer bodymiddle;
    private final AdvancedModelRenderer bodyend;
    private final AdvancedModelRenderer tailbase;
    private final AdvancedModelRenderer tailmiddle;
    private final AdvancedModelRenderer tailfinend;
    private final AdvancedModelRenderer tailfinbase;
    private final AdvancedModelRenderer bodyendslope;
    private final AdvancedModelRenderer analfin;
    private final AdvancedModelRenderer dorsalfin;
    private final AdvancedModelRenderer bodymiddleslope;
    private final AdvancedModelRenderer rightpelvicfin;
    private final AdvancedModelRenderer leftpelvicfin;
    private final AdvancedModelRenderer bodyfrontslope;
    private final AdvancedModelRenderer leftpectoralfin;
    private final AdvancedModelRenderer rightpectoralfin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer headmiddle;
    private final AdvancedModelRenderer headmiddlefront;
    private final AdvancedModelRenderer headfront;
    private final AdvancedModelRenderer headfrontb;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer leftgillcover;
    private final AdvancedModelRenderer rightgillcover;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cheeks;

    public ModelPeipiaosteus() {
        this.textureWidth = 64;
        this.textureHeight = 32;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 19.0F, 0.0F);


        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.root.addChild(bodyfront);
        this.setRotateAngle(bodyfront, -0.0424F, 0.0F, 0.0F);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 25, -1.5F, -0.7F, -5.0F, 3, 2, 5, 0.0F, false));

        this.bodymiddle = new AdvancedModelRenderer(this);
        this.bodymiddle.setRotationPoint(0.01F, 0.01F, -0.4F);
        this.bodyfront.addChild(bodymiddle);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 0, 17, -1.5F, -0.7F, 0.0F, 3, 2, 5, 0.0F, false));

        this.bodyend = new AdvancedModelRenderer(this);
        this.bodyend.setRotationPoint(0.0F, 0.01F, 4.65F);
        this.bodymiddle.addChild(bodyend);
        this.bodyend.cubeList.add(new ModelBox(bodyend, 0, 10, -1.01F, -0.7F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tailbase = new AdvancedModelRenderer(this);
        this.tailbase.setRotationPoint(0.0F, 0.3F, 3.7F);
        this.bodyend.addChild(tailbase);
        this.setRotateAngle(tailbase, 0.0213F, 0.0F, 0.0F);
        this.tailbase.cubeList.add(new ModelBox(tailbase, 21, 14, -0.5F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.tailmiddle = new AdvancedModelRenderer(this);
        this.tailmiddle.setRotationPoint(0.01F, -0.4F, 1.6F);
        this.tailbase.addChild(tailmiddle);
        this.setRotateAngle(tailmiddle, 0.3821F, 0.0F, 0.0F);
        this.tailmiddle.cubeList.add(new ModelBox(tailmiddle, 12, 14, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.tailfinend = new AdvancedModelRenderer(this);
        this.tailfinend.setRotationPoint(-0.01F, 0.0F, 2.8F);
        this.tailmiddle.addChild(tailfinend);
        this.setRotateAngle(tailfinend, -0.0424F, 0.0F, 0.0F);
        this.tailfinend.cubeList.add(new ModelBox(tailfinend, 31, 0, 0.0F, -0.5F, 0.0F, 0, 2, 4, 0.0F, false));

        this.tailfinbase = new AdvancedModelRenderer(this);
        this.tailfinbase.setRotationPoint(0.0F, 1.5F, -0.3F);
        this.tailmiddle.addChild(tailfinbase);
        this.setRotateAngle(tailfinbase, -0.4245F, 0.0F, 0.0F);
        this.tailfinbase.cubeList.add(new ModelBox(tailfinbase, 29, 2, 0.0F, -3.0F, 0.0F, 0, 3, 5, 0.0F, false));

        this.bodyendslope = new AdvancedModelRenderer(this);
        this.bodyendslope.setRotationPoint(-0.01F, 1.3F, 4.0F);
        this.bodyend.addChild(bodyendslope);
        this.setRotateAngle(bodyendslope, 0.0848F, 0.0F, 0.0F);
        this.bodyendslope.cubeList.add(new ModelBox(bodyendslope, 27, 11, -1.0F, -1.0F, -4.0F, 2, 1, 4, -0.01F, false));

        this.analfin = new AdvancedModelRenderer(this);
        this.analfin.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.bodyendslope.addChild(analfin);
        this.setRotateAngle(analfin, 0.7854F, 0.0F, 0.0F);
        this.analfin.cubeList.add(new ModelBox(analfin, 40, 6, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.dorsalfin = new AdvancedModelRenderer(this);
        this.dorsalfin.setRotationPoint(0.0F, -0.7F, -0.2F);
        this.bodyend.addChild(dorsalfin);
        this.setRotateAngle(dorsalfin, -0.8067F, 0.0F, 0.0F);
        this.dorsalfin.cubeList.add(new ModelBox(dorsalfin, 45, 6, 0.0F, -3.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.bodymiddleslope = new AdvancedModelRenderer(this);
        this.bodymiddleslope.setRotationPoint(0.01F, 1.65F, 5.0F);
        this.bodymiddle.addChild(bodymiddleslope);
        this.setRotateAngle(bodymiddleslope, 0.0637F, 0.0F, 0.0F);
        this.bodymiddleslope.cubeList.add(new ModelBox(bodymiddleslope, 17, 26, -1.51F, -1.0F, -5.0F, 3, 1, 5, -0.015F, false));

        this.rightpelvicfin = new AdvancedModelRenderer(this);
        this.rightpelvicfin.setRotationPoint(0.3F, 0.0F, -3.7F);
        this.bodymiddleslope.addChild(rightpelvicfin);
        this.setRotateAngle(rightpelvicfin, 0.7854F, 0.0424F, -0.5095F);
        this.rightpelvicfin.cubeList.add(new ModelBox(rightpelvicfin, 40, 10, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.leftpelvicfin = new AdvancedModelRenderer(this);
        this.leftpelvicfin.setRotationPoint(-0.34F, 0.0F, -3.7F);
        this.bodymiddleslope.addChild(leftpelvicfin);
        this.setRotateAngle(leftpelvicfin, 0.7854F, -0.0424F, 0.5095F);
        this.leftpelvicfin.cubeList.add(new ModelBox(leftpelvicfin, 40, 10, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, true));

        this.bodyfrontslope = new AdvancedModelRenderer(this);
        this.bodyfrontslope.setRotationPoint(-0.01F, 1.96F, 0.05F);
        this.bodyfront.addChild(bodyfrontslope);
        this.setRotateAngle(bodyfrontslope, 0.0637F, 0.0F, 0.0F);
        this.bodyfrontslope.cubeList.add(new ModelBox(bodyfrontslope, 12, 19, -1.49F, -1.0F, -5.0F, 3, 1, 5, -0.01F, false));

        this.leftpectoralfin = new AdvancedModelRenderer(this);
        this.leftpectoralfin.setRotationPoint(-1.3F, -0.4F, -4.8F);
        this.bodyfrontslope.addChild(leftpectoralfin);
        this.setRotateAngle(leftpectoralfin, 0.4882F, -0.2335F, 0.4245F);
        this.leftpectoralfin.cubeList.add(new ModelBox(leftpectoralfin, 40, 0, 0.0F, 0.0F, 0.0F, 0, 4, 3, 0.0F, false));

        this.rightpectoralfin = new AdvancedModelRenderer(this);
        this.rightpectoralfin.setRotationPoint(1.3F, -0.4F, -4.8F);
        this.bodyfrontslope.addChild(rightpectoralfin);
        this.setRotateAngle(rightpectoralfin, 0.4882F, 0.2335F, -0.4245F);
        this.rightpectoralfin.cubeList.add(new ModelBox(rightpectoralfin, 47, 0, 0.0F, 0.0F, 0.0F, 0, 4, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.7F, -4.9F);
        this.bodyfront.addChild(head);
        this.setRotateAngle(head, 0.0424F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 29, 24, -1.0F, 0.0F, -2.0F, 2, 3, 2, 0.0F, false));

        this.headmiddle = new AdvancedModelRenderer(this);
        this.headmiddle.setRotationPoint(-0.01F, 0.0F, -2.0F);
        this.head.addChild(headmiddle);
        this.setRotateAngle(headmiddle, 0.1485F, 0.0F, 0.0F);
        this.headmiddle.cubeList.add(new ModelBox(headmiddle, 16, 10, -1.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

        this.headmiddlefront = new AdvancedModelRenderer(this);
        this.headmiddlefront.setRotationPoint(0.02F, 0.0F, -1.0F);
        this.headmiddle.addChild(headmiddlefront);
        this.setRotateAngle(headmiddlefront, 0.5519F, 0.0F, 0.0F);
        this.headmiddlefront.cubeList.add(new ModelBox(headmiddlefront, 0, 5, -1.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

        this.headfront = new AdvancedModelRenderer(this);
        this.headfront.setRotationPoint(-0.05F, 0.0F, -1.0F);
        this.headmiddlefront.addChild(headfront);
        this.setRotateAngle(headfront, 0.4882F, -0.0213F, 0.0848F);
        this.headfront.cubeList.add(new ModelBox(headfront, 9, 9, -1.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

        this.headfrontb = new AdvancedModelRenderer(this);
        this.headfrontb.setRotationPoint(0.1F, 0.0F, -0.5F);
        this.headfront.addChild(headfrontb);
        this.setRotateAngle(headfrontb, 0.0F, -0.0637F, -0.1698F);
        this.headfrontb.cubeList.add(new ModelBox(headfrontb, 7, 4, -1.0F, 0.0F, -0.5F, 2, 3, 1, 0.0F, false));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(-0.7F, 1.07F, -0.97F);
        this.headmiddle.addChild(righteye);
        this.setRotateAngle(righteye, -0.1485F, -0.1061F, -0.0848F);
        this.righteye.cubeList.add(new ModelBox(righteye, 1, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(0.7F, 1.07F, -0.97F);
        this.headmiddle.addChild(lefteye);
        this.setRotateAngle(lefteye, -0.1485F, 0.1061F, 0.0848F);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 6, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.leftgillcover = new AdvancedModelRenderer(this);
        this.leftgillcover.setRotationPoint(-1.3F, 1.55F, -2.0F);
        this.head.addChild(leftgillcover);
        this.setRotateAngle(leftgillcover, -0.0424F, -0.1485F, 0.0F);
        this.leftgillcover.cubeList.add(new ModelBox(leftgillcover, 22, 0, 0.0F, -1.5F, 0.0F, 1, 3, 3, 0.0F, false));

        this.rightgillcover = new AdvancedModelRenderer(this);
        this.rightgillcover.setRotationPoint(1.3F, 1.55F, -2.0F);
        this.head.addChild(rightgillcover);
        this.setRotateAngle(rightgillcover, -0.0424F, 0.1485F, 0.0F);
        this.rightgillcover.cubeList.add(new ModelBox(rightgillcover, 13, 0, -1.0F, -1.5F, 0.0F, 1, 3, 3, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 2.5F, -1.8F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.1698F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 24, 19, -1.0F, -0.5F, -2.2F, 2, 1, 3, 0.0F, false));

        this.cheeks = new AdvancedModelRenderer(this);
        this.cheeks.setRotationPoint(0.02F, -0.5F, -1.2F);
        this.lowerjaw.addChild(cheeks);
        this.setRotateAngle(cheeks, -0.4245F, 0.0F, 0.0F);
        this.cheeks.cubeList.add(new ModelBox(cheeks, 14, 7, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));


        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.2F;
        this.root.offsetX = -0.2F;
        this.root.rotateAngleY = (float)Math.toRadians(230);
        this.root.rotateAngleX = (float)Math.toRadians(20);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 3.0F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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
        //this.body.offsetY = 1.0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.bodymiddle, this.bodyend, this.tailbase, this.tailmiddle};

        float speed = 0.4F;
        float taildegree = 0.35F;

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
            taildegree = 0.15F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(root, speed, 0.3F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.root.rotateAngleZ = (float) Math.toRadians(90);
                //this.body.offsetY = 0.95F;
                this.bob(root, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
