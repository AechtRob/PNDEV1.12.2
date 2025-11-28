package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAusktribosphenos;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAusktribosphenos extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer bodymiddle;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer lowerjawbase;
    private final AdvancedModelRenderer lowerjawfront;
    private final AdvancedModelRenderer leftlowerjawslope;
    private final AdvancedModelRenderer rightlowerjawslope;
    private final AdvancedModelRenderer leftlowerteeth;
    private final AdvancedModelRenderer rightlowerteeth;
    private final AdvancedModelRenderer cheeks;
    private final AdvancedModelRenderer snout;
    private final AdvancedModelRenderer snoutslope;
    private final AdvancedModelRenderer leftsnoutside;
    private final AdvancedModelRenderer rightsnoutside;
    private final AdvancedModelRenderer leftupperteeth;
    private final AdvancedModelRenderer rightupperteeth;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer leftupperarm;
    private final AdvancedModelRenderer leftlowerarm;
    private final AdvancedModelRenderer leftfrontfoot;
    private final AdvancedModelRenderer rightupperarm;
    private final AdvancedModelRenderer rightlowerarm;
    private final AdvancedModelRenderer rightfrontfoot;
    private final AdvancedModelRenderer tailbase;
    private final AdvancedModelRenderer tailmiddle;
    private final AdvancedModelRenderer tailend;
    private final AdvancedModelRenderer leftthigh;
    private final AdvancedModelRenderer leftshin;
    private final AdvancedModelRenderer leftankle;
    private final AdvancedModelRenderer lefthindfoot;
    private final AdvancedModelRenderer rightthigh;
    private final AdvancedModelRenderer rightshin;
    private final AdvancedModelRenderer rightankle;
    private final AdvancedModelRenderer righthindfoot;


    private ModelAnimator animator;

    public ModelAusktribosphenos() {
        this.textureWidth = 64;
        this.textureHeight = 32;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 19.96F, 3.5F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.5943F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 14, -2.0F, -1.5F, -2.5F, 4, 4, 4, 0.0F, true));

        this.bodymiddle = new AdvancedModelRenderer(this);
        this.bodymiddle.setRotationPoint(0.0F, -0.4F, -1.5F);
        this.hips.addChild(bodymiddle);
        this.setRotateAngle(bodymiddle, 0.6369F, 0.0F, 0.0F);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 0, 23, -2.5F, -1.5F, -4.0F, 5, 5, 4, 0.0F, true));

        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, -0.5F, -3.3F);
        this.bodymiddle.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.2122F, 0.0F, 0.0F);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 19, 24, -2.0F, -1.0F, -4.0F, 4, 4, 4, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.1F, -3.0F);
        this.bodyfront.addChild(neck);
        this.setRotateAngle(neck, -0.2972F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 17, 17, -1.5F, -1.0F, -2.7F, 3, 3, 3, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.01F, -0.1F, -2.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.2122F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 32, 23, -1.5F, -1.1F, -1.5F, 3, 2, 2, 0.0F, true));

        this.lowerjawbase = new AdvancedModelRenderer(this);
        this.lowerjawbase.setRotationPoint(0.0F, 0.4F, -0.02F);
        this.head.addChild(lowerjawbase);
        this.lowerjawbase.cubeList.add(new ModelBox(lowerjawbase, 8, 6, -1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F, true));

        this.lowerjawfront = new AdvancedModelRenderer(this);
        this.lowerjawfront.setRotationPoint(0.01F, 1.0F, -1.5F);
        this.lowerjawbase.addChild(lowerjawfront);
        this.setRotateAngle(lowerjawfront, -0.3183F, 0.0F, 0.0F);
        this.lowerjawfront.cubeList.add(new ModelBox(lowerjawfront, 17, 6, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.leftlowerjawslope = new AdvancedModelRenderer(this);
        this.leftlowerjawslope.setRotationPoint(-0.9F, -0.62F, 0.0F);
        this.lowerjawfront.addChild(leftlowerjawslope);
        this.setRotateAngle(leftlowerjawslope, 0.1485F, -0.4245F, -0.0424F);
        this.leftlowerjawslope.cubeList.add(new ModelBox(leftlowerjawslope, 8, 3, 0.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F, true));

        this.rightlowerjawslope = new AdvancedModelRenderer(this);
        this.rightlowerjawslope.setRotationPoint(0.9F, -0.62F, 0.0F);
        this.lowerjawfront.addChild(rightlowerjawslope);
        this.setRotateAngle(rightlowerjawslope, 0.1485F, 0.4245F, 0.0424F);
        this.rightlowerjawslope.cubeList.add(new ModelBox(rightlowerjawslope, 13, 3, -1.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F, true));

        this.leftlowerteeth = new AdvancedModelRenderer(this);
        this.leftlowerteeth.setRotationPoint(-0.4F, -0.7F, -1.05F);
        this.lowerjawfront.addChild(leftlowerteeth);
        this.setRotateAngle(leftlowerteeth, 0.1698F, -0.2335F, 0.0F);
        this.leftlowerteeth.cubeList.add(new ModelBox(leftlowerteeth, 8, 0, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, true));

        this.rightlowerteeth = new AdvancedModelRenderer(this);
        this.rightlowerteeth.setRotationPoint(0.4F, -0.7F, -1.05F);
        this.lowerjawfront.addChild(rightlowerteeth);
        this.setRotateAngle(rightlowerteeth, 0.1698F, 0.2335F, 0.0F);
        this.rightlowerteeth.cubeList.add(new ModelBox(rightlowerteeth, 13, 0, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, true));

        this.cheeks = new AdvancedModelRenderer(this);
        this.cheeks.setRotationPoint(-0.01F, 0.0F, -1.5F);
        this.lowerjawbase.addChild(cheeks);
        this.setRotateAngle(cheeks, -0.3396F, 0.0F, 0.0F);
        this.cheeks.cubeList.add(new ModelBox(cheeks, 0, 4, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, true));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(0.0F, 0.53F, -1.4F);
        this.head.addChild(snout);
        this.setRotateAngle(snout, -0.2122F, 0.0F, 0.0F);
        this.snout.cubeList.add(new ModelBox(snout, 24, 6, -0.5F, -1.0F, -2.15F, 1, 1, 2, 0.0F, true));

        this.snoutslope = new AdvancedModelRenderer(this);
        this.snoutslope.setRotationPoint(0.01F, -1.58F, -0.42F);
        this.snout.addChild(snoutslope);
        this.setRotateAngle(snoutslope, 0.6369F, 0.0F, 0.0F);
        this.snoutslope.cubeList.add(new ModelBox(snoutslope, 25, 3, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.leftsnoutside = new AdvancedModelRenderer(this);
        this.leftsnoutside.setRotationPoint(-1.0F, -0.4F, -0.3F);
        this.snout.addChild(leftsnoutside);
        this.setRotateAngle(leftsnoutside, -0.1061F, -0.5519F, 0.0F);
        this.leftsnoutside.cubeList.add(new ModelBox(leftsnoutside, 31, 6, 0.0F, -0.5F, -1.1F, 1, 1, 2, 0.0F, true));

        this.rightsnoutside = new AdvancedModelRenderer(this);
        this.rightsnoutside.setRotationPoint(1.0F, -0.4F, -0.3F);
        this.snout.addChild(rightsnoutside);
        this.setRotateAngle(rightsnoutside, -0.1061F, 0.5519F, 0.0F);
        this.rightsnoutside.cubeList.add(new ModelBox(rightsnoutside, 31, 2, -1.0F, -0.5F, -1.1F, 1, 1, 2, 0.0F, true));

        this.leftupperteeth = new AdvancedModelRenderer(this);
        this.leftupperteeth.setRotationPoint(-0.42F, -0.3F, -0.9F);
        this.snout.addChild(leftupperteeth);
        this.setRotateAngle(leftupperteeth, -0.1698F, -0.2335F, 0.0F);
        this.leftupperteeth.cubeList.add(new ModelBox(leftupperteeth, 18, 0, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, true));

        this.rightupperteeth = new AdvancedModelRenderer(this);
        this.rightupperteeth.setRotationPoint(0.42F, -0.3F, -0.9F);
        this.snout.addChild(rightupperteeth);
        this.setRotateAngle(rightupperteeth, -0.1698F, 0.2335F, 0.0F);
        this.rightupperteeth.cubeList.add(new ModelBox(rightupperteeth, 23, 0, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, true));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(-1.04F, -0.15F, -1.05F);
        this.head.addChild(lefteye);
        this.setRotateAngle(lefteye, -0.1061F, -0.0424F, 0.0F);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 1, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(1.04F, -0.15F, -1.05F);
        this.head.addChild(righteye);
        this.setRotateAngle(righteye, -0.1061F, 0.0424F, 0.0F);
        this.righteye.cubeList.add(new ModelBox(righteye, 6, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.41F, -1.51F);
        this.head.addChild(throat);
        this.throat.cubeList.add(new ModelBox(throat, 18, 3, -1.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, true));

        this.leftupperarm = new AdvancedModelRenderer(this);
        this.leftupperarm.setRotationPoint(-1.9F, 1.75F, -3.1F);
        this.bodyfront.addChild(leftupperarm);
        this.setRotateAngle(leftupperarm, -0.0213F, 0.0F, 0.6535F);
        this.leftupperarm.cubeList.add(new ModelBox(leftupperarm, 30, 18, -0.6F, -0.5F, -0.6F, 2, 2, 2, 0.0F, true));

        this.leftlowerarm = new AdvancedModelRenderer(this);
        this.leftlowerarm.setRotationPoint(0.0F, 1.0F, 0.3F);
        this.leftupperarm.addChild(leftlowerarm);
        this.setRotateAngle(leftlowerarm, -0.5943F, 0.0848F, -0.6192F);
        this.leftlowerarm.cubeList.add(new ModelBox(leftlowerarm, 39, 8, -0.5F, 0.55F, -0.5F, 1, 2, 1, 0.0F, true));

        this.leftfrontfoot = new AdvancedModelRenderer(this);
        this.leftfrontfoot.setRotationPoint(-0.01F, 1.5F, 0.0F);
        this.leftlowerarm.addChild(leftfrontfoot);
        this.setRotateAngle(leftfrontfoot, 0.3609F, 0.0424F, 0.0F);
        this.leftfrontfoot.cubeList.add(new ModelBox(leftfrontfoot, 44, 17, -0.5F, 0.05F, -1.6F, 1, 1, 2, 0.0F, true));

        this.rightupperarm = new AdvancedModelRenderer(this);
        this.rightupperarm.setRotationPoint(1.9F, 1.75F, -3.1F);
        this.bodyfront.addChild(rightupperarm);
        this.setRotateAngle(rightupperarm, -0.0191F, -0.0095F, -0.6535F);
        this.rightupperarm.cubeList.add(new ModelBox(rightupperarm, 27, 13, -1.4F, -0.5F, -0.6F, 2, 2, 2, 0.0F, true));

        this.rightlowerarm = new AdvancedModelRenderer(this);
        this.rightlowerarm.setRotationPoint(0.0F, 1.25F, 0.3F);
        this.rightupperarm.addChild(rightlowerarm);
        this.setRotateAngle(rightlowerarm, -0.575F, 0.0355F, 0.6193F);
        this.rightlowerarm.cubeList.add(new ModelBox(rightlowerarm, 44, 8, -0.5F, -0.1F, -0.5F, 1, 2, 1, 0.0F, true));

        this.rightfrontfoot = new AdvancedModelRenderer(this);
        this.rightfrontfoot.setRotationPoint(0.01F, 1.5F, 0.0F);
        this.rightlowerarm.addChild(rightfrontfoot);
        this.setRotateAngle(rightfrontfoot, 0.3609F, -0.0424F, 0.0F);
        this.rightfrontfoot.cubeList.add(new ModelBox(rightfrontfoot, 41, 13, -0.5F, -0.2F, -1.6F, 1, 1, 2, 0.0F, true));

        this.tailbase = new AdvancedModelRenderer(this);
        this.tailbase.setRotationPoint(0.0F, 0.1F, 1.1F);
        this.hips.addChild(tailbase);
        this.setRotateAngle(tailbase, 0.1698F, 0.0F, 0.0F);
        this.tailbase.cubeList.add(new ModelBox(tailbase, 36, 28, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.tailmiddle = new AdvancedModelRenderer(this);
        this.tailmiddle.setRotationPoint(-0.01F, 0.01F, 2.75F);
        this.tailbase.addChild(tailmiddle);
        this.setRotateAngle(tailmiddle, 0.1061F, 0.0F, 0.0F);
        this.tailmiddle.cubeList.add(new ModelBox(tailmiddle, 42, 26, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.tailend = new AdvancedModelRenderer(this);
        this.tailend.setRotationPoint(0.01F, 0.0F, 2.75F);
        this.tailmiddle.addChild(tailend);
        this.setRotateAngle(tailend, 0.1274F, 0.0F, 0.0F);
        this.tailend.cubeList.add(new ModelBox(tailend, 43, 21, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.leftthigh = new AdvancedModelRenderer(this);
        this.leftthigh.setRotationPoint(-1.9F, 0.03F, -0.4F);
        this.hips.addChild(leftthigh);
        this.setRotateAngle(leftthigh, 0.0213F, 0.0213F, 0.5142F);
        this.leftthigh.cubeList.add(new ModelBox(leftthigh, 13, 10, -0.7F, -0.6F, -1.3F, 2, 3, 3, 0.0F, true));

        this.leftshin = new AdvancedModelRenderer(this);
        this.leftshin.setRotationPoint(0.225F, 2.1F, -0.1F);
        this.leftthigh.addChild(leftshin);
        this.setRotateAngle(leftshin, 1.5284F, -0.0379F, -0.5629F);
        this.leftshin.cubeList.add(new ModelBox(leftshin, 39, 18, -0.5F, -0.3F, -0.3F, 1, 3, 1, 0.0F, true));

        this.leftankle = new AdvancedModelRenderer(this);
        this.leftankle.setRotationPoint(-0.01F, 2.3F, 0.2F);
        this.leftshin.addChild(leftankle);
        this.setRotateAngle(leftankle, -2.0166F, 0.1061F, -0.1061F);
        this.leftankle.cubeList.add(new ModelBox(leftankle, 47, 11, -0.5F, -0.1F, -0.5F, 1, 2, 1, 0.0F, true));

        this.lefthindfoot = new AdvancedModelRenderer(this);
        this.lefthindfoot.setRotationPoint(-0.01F, 1.4F, 0.0F);
        this.leftankle.addChild(lefthindfoot);
        this.setRotateAngle(lefthindfoot, 1.0613F, -0.0213F, 0.0F);
        this.lefthindfoot.cubeList.add(new ModelBox(lefthindfoot, 23, 10, -0.5F, -0.2F, -1.8F, 1, 1, 2, 0.0F, true));

        this.rightthigh = new AdvancedModelRenderer(this);
        this.rightthigh.setRotationPoint(1.925F, 0.03F, -0.4F);
        this.hips.addChild(rightthigh);
        this.setRotateAngle(rightthigh, 0.0247F, -0.0173F, -0.5142F);
        this.rightthigh.cubeList.add(new ModelBox(rightthigh, 0, 7, -1.3F, -0.6F, -1.3F, 2, 3, 3, 0.0F, true));

        this.rightshin = new AdvancedModelRenderer(this);
        this.rightshin.setRotationPoint(-0.2F, 2.15F, -0.1F);
        this.rightthigh.addChild(rightshin);
        this.setRotateAngle(rightshin, 1.5199F, 0.0379F, 0.5629F);
        this.rightshin.cubeList.add(new ModelBox(rightshin, 36, 13, -0.5F, -0.3F, -0.3F, 1, 3, 1, 0.0F, true));

        this.rightankle = new AdvancedModelRenderer(this);
        this.rightankle.setRotationPoint(0.01F, 2.3F, 0.2F);
        this.rightshin.addChild(rightankle);
        this.setRotateAngle(rightankle, -2.0166F, -0.1061F, 0.1061F);
        this.rightankle.cubeList.add(new ModelBox(rightankle, 48, 15, -0.5F, -0.1F, -0.5F, 1, 2, 1, 0.0F, true));

        this.righthindfoot = new AdvancedModelRenderer(this);
        this.righthindfoot.setRotationPoint(0.01F, 1.4F, 0.0F);
        this.rightankle.addChild(righthindfoot);
        this.setRotateAngle(righthindfoot, 1.0613F, 0.0213F, 0.0F);
        this.righthindfoot.cubeList.add(new ModelBox(righthindfoot, 32, 10, -0.5F, -0.2F, -1.8F, 1, 1, 2, 0.0F, true));



        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -4.80F;
        this.root.offsetX = 1.0F;
        this.root.rotateAngleY = (float)Math.toRadians(250);
        this.root.rotateAngleX = (float)Math.toRadians(-8);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 3.6F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.3F, 3.8F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetY = 0.22F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.root.offsetY = -0.2F;
        this.root.rotateAngleY  = (float)Math.toRadians(90);
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraAusktribosphenos entityAusktribosphenos = (EntityPrehistoricFloraAusktribosphenos) e;

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tailbase, this.tailmiddle, this.tailend};
        AdvancedModelRenderer[] Neck = {};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        if (entityAusktribosphenos.getAnimation() == entityAusktribosphenos.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityAusktribosphenos.isReallyInWater()) {

                if (f3 == 0.0F || !entityAusktribosphenos.getIsMoving()) {
                    if (entityAusktribosphenos.getAnimation() != entityAusktribosphenos.EAT_ANIMATION
                        && entityAusktribosphenos.getAnimation() != entityAusktribosphenos.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityAusktribosphenos.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAusktribosphenos ee = (EntityPrehistoricFloraAusktribosphenos) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            //animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAusktribosphenos entity = (EntityPrehistoricFloraAusktribosphenos) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -3.75 + (((tickAnim - 8) / 7) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 7.5 + (((tickAnim - 8) / 7) * (0-(7.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 25.75 + (((tickAnim - 8) / 7) * (0-(25.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawbase, lowerjawbase.rotateAngleX + (float) Math.toRadians(xx), lowerjawbase.rotateAngleY + (float) Math.toRadians(yy), lowerjawbase.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAusktribosphenos entity = (EntityPrehistoricFloraAusktribosphenos) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-38.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -38.25 + (((tickAnim - 15) / 10) * (58.5-(-38.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 58.5 + (((tickAnim - 25) / 10) * (-38.25-(58.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -38.25 + (((tickAnim - 35) / 10) * (58.5-(-38.25)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 58.5 + (((tickAnim - 45) / 5) * (0-(58.5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-38.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -38.75 + (((tickAnim - 15) / 10) * (-20.25-(-38.75)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -20.25 + (((tickAnim - 25) / 10) * (-38.75-(-20.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -38.75 + (((tickAnim - 35) / 10) * (-20.25-(-38.75)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -20.25 + (((tickAnim - 45) / 5) * (0-(-20.25)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.88-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 7.88 + (((tickAnim - 8) / 7) * (77.25-(7.88)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 77.25 + (((tickAnim - 15) / 5) * (0.5-(77.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0.5 + (((tickAnim - 20) / 5) * (85.75-(0.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 85.75 + (((tickAnim - 25) / 5) * (-16-(85.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -16 + (((tickAnim - 30) / 5) * (77.25-(-16)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 77.25 + (((tickAnim - 35) / 5) * (0.5-(77.25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0.5 + (((tickAnim - 40) / 5) * (85.75-(0.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 85.75 + (((tickAnim - 45) / 5) * (0-(85.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightankle, rightankle.rotateAngleX + (float) Math.toRadians(xx), rightankle.rotateAngleY + (float) Math.toRadians(yy), rightankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 26.75 + (((tickAnim - 8) / 7) * (0-(26.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (35.25-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 35.25 + (((tickAnim - 25) / 5) * (34.88-(35.25)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 34.88 + (((tickAnim - 30) / 5) * (0-(34.88)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (35.25-(0)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 35.25 + (((tickAnim - 45) / 5) * (0-(35.25)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthindfoot, righthindfoot.rotateAngleX + (float) Math.toRadians(xx), righthindfoot.rotateAngleY + (float) Math.toRadians(yy), righthindfoot.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAusktribosphenos entity = (EntityPrehistoricFloraAusktribosphenos) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 10) / 30) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -2.5 + (((tickAnim - 40) / 10) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = -1 + (((tickAnim - 10) / 30) * (-1-(-1)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -1 + (((tickAnim - 40) / 10) * (0-(-1)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -2.75 + (((tickAnim - 10) / 30) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -2.75 + (((tickAnim - 40) / 10) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.56288-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1.41718-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.27005-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 5.56288 + (((tickAnim - 10) / 30) * (5.56288-(5.56288)));
            yy = -1.41718 + (((tickAnim - 10) / 30) * (-1.41718-(-1.41718)));
            zz = 0.27005 + (((tickAnim - 10) / 30) * (0.27005-(0.27005)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 5.56288 + (((tickAnim - 40) / 10) * (0-(5.56288)));
            yy = -1.41718 + (((tickAnim - 40) / 10) * (0-(-1.41718)));
            zz = 0.27005 + (((tickAnim - 40) / 10) * (0-(0.27005)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 7.25 + (((tickAnim - 10) / 30) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 40) / 10) * (0-(7.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailbase, tailbase.rotateAngleX + (float) Math.toRadians(xx), tailbase.rotateAngleY + (float) Math.toRadians(yy), tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -26.5 + (((tickAnim - 10) / 30) * (-26.5-(-26.5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -26.5 + (((tickAnim - 40) / 10) * (0-(-26.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftankle, leftankle.rotateAngleX + (float) Math.toRadians(xx), leftankle.rotateAngleY + (float) Math.toRadians(yy), leftankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (28.75435-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.75352-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.30172-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 28.75435 + (((tickAnim - 10) / 30) * (28.75435-(28.75435)));
            yy = 0.75352 + (((tickAnim - 10) / 30) * (0.75352-(0.75352)));
            zz = -1.30172 + (((tickAnim - 10) / 30) * (-1.30172-(-1.30172)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 28.75435 + (((tickAnim - 40) / 10) * (0-(28.75435)));
            yy = 0.75352 + (((tickAnim - 40) / 10) * (0-(0.75352)));
            zz = -1.30172 + (((tickAnim - 40) / 10) * (0-(-1.30172)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthindfoot, lefthindfoot.rotateAngleX + (float) Math.toRadians(xx), lefthindfoot.rotateAngleY + (float) Math.toRadians(yy), lefthindfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -26.5 + (((tickAnim - 10) / 30) * (-26.5-(-26.5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -26.5 + (((tickAnim - 40) / 10) * (0-(-26.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightankle, rightankle.rotateAngleX + (float) Math.toRadians(xx), rightankle.rotateAngleY + (float) Math.toRadians(yy), rightankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (28.75435-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.75352-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.30172-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 28.75435 + (((tickAnim - 10) / 30) * (28.75435-(28.75435)));
            yy = 0.75352 + (((tickAnim - 10) / 30) * (0.75352-(0.75352)));
            zz = -1.30172 + (((tickAnim - 10) / 30) * (-1.30172-(-1.30172)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 28.75435 + (((tickAnim - 40) / 10) * (0-(28.75435)));
            yy = 0.75352 + (((tickAnim - 40) / 10) * (0-(0.75352)));
            zz = -1.30172 + (((tickAnim - 40) / 10) * (0-(-1.30172)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthindfoot, righthindfoot.rotateAngleX + (float) Math.toRadians(xx), righthindfoot.rotateAngleY + (float) Math.toRadians(yy), righthindfoot.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAusktribosphenos entity = (EntityPrehistoricFloraAusktribosphenos) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 14.75 + (((tickAnim - 5) / 7) * (0-(14.75)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 20.5 + (((tickAnim - 5) / 7) * (0-(20.5)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 20.75 + (((tickAnim - 5) / 3) * (0-(20.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawbase, lowerjawbase.rotateAngleX + (float) Math.toRadians(xx), lowerjawbase.rotateAngleY + (float) Math.toRadians(yy), lowerjawbase.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(lowerjawfront, lowerjawfront.rotateAngleX + (float) Math.toRadians(0), lowerjawfront.rotateAngleY + (float) Math.toRadians(0), lowerjawfront.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAusktribosphenos entity = (EntityPrehistoricFloraAusktribosphenos) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 11.25 + (((tickAnim - 4) / 4) * (-13.25-(11.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -13.25 + (((tickAnim - 8) / 2) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 4) / 4) * (0.5-(-20)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.5 + (((tickAnim - 8) / 2) * (0-(0.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 25 + (((tickAnim - 4) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawbase, lowerjawbase.rotateAngleX + (float) Math.toRadians(xx), lowerjawbase.rotateAngleY + (float) Math.toRadians(yy), lowerjawbase.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraAusktribosphenos entity = (EntityPrehistoricFloraAusktribosphenos) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -42.46702 + (((tickAnim - 0) / 7) * (17.58-(-42.46702)));
            yy = -1.90024 + (((tickAnim - 0) / 7) * (0-(-1.90024)));
            zz = -1.98823 + (((tickAnim - 0) / 7) * (0-(-1.98823)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 17.58 + (((tickAnim - 7) / 8) * (-42.46702-(17.58)));
            yy = 0 + (((tickAnim - 7) / 8) * (-1.90024-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (-1.98823-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 20.75 + (((tickAnim - 0) / 7) * (24.33-(20.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 24.33 + (((tickAnim - 7) / 4) * (-35.6-(24.33)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -35.6 + (((tickAnim - 11) / 4) * (20.75-(-35.6)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.25 + (((tickAnim - 7) / 8) * (0-(0.25)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftlowerarm.rotationPointX = this.leftlowerarm.rotationPointX + (float)(xx);
        this.leftlowerarm.rotationPointY = this.leftlowerarm.rotationPointY - (float)(yy);
        this.leftlowerarm.rotationPointZ = this.leftlowerarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 16 + (((tickAnim - 0) / 3) * (10.98-(16)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 10.98 + (((tickAnim - 3) / 4) * (51.25-(10.98)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 51.25 + (((tickAnim - 7) / 4) * (67.15-(51.25)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 67.15 + (((tickAnim - 11) / 4) * (16-(67.15)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfrontfoot, leftfrontfoot.rotateAngleX + (float) Math.toRadians(xx), leftfrontfoot.rotateAngleY + (float) Math.toRadians(yy), leftfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.275 + (((tickAnim - 7) / 8) * (0-(0.275)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfrontfoot.rotationPointX = this.leftfrontfoot.rotationPointX + (float)(xx);
        this.leftfrontfoot.rotationPointY = this.leftfrontfoot.rotationPointY - (float)(yy);
        this.leftfrontfoot.rotationPointZ = this.leftfrontfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 17.58 + (((tickAnim - 0) / 6) * (-37.11889-(17.58)));
            yy = 0 + (((tickAnim - 0) / 6) * (4.02912-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (5.10334-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -37.11889 + (((tickAnim - 6) / 9) * (17.58-(-37.11889)));
            yy = 4.02912 + (((tickAnim - 6) / 9) * (0-(4.02912)));
            zz = 5.10334 + (((tickAnim - 6) / 9) * (0-(5.10334)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 24.33 + (((tickAnim - 0) / 3) * (-24.51-(24.33)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -24.51 + (((tickAnim - 3) / 3) * (15.08164-(-24.51)));
            yy = 0 + (((tickAnim - 3) / 3) * (-7.6878-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (-2.41507-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 15.08164 + (((tickAnim - 6) / 9) * (24.33-(15.08164)));
            yy = -7.6878 + (((tickAnim - 6) / 9) * (0-(-7.6878)));
            zz = -2.41507 + (((tickAnim - 6) / 9) * (0-(-2.41507)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 6) * (-0.375-(0.25)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            yy = -0.375 + (((tickAnim - 6) / 9) * (0.25-(-0.375)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightlowerarm.rotationPointX = this.rightlowerarm.rotationPointX + (float)(xx);
        this.rightlowerarm.rotationPointY = this.rightlowerarm.rotationPointY - (float)(yy);
        this.rightlowerarm.rotationPointZ = this.rightlowerarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 51.25 + (((tickAnim - 0) / 3) * (43.67-(51.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 43.67 + (((tickAnim - 3) / 3) * (16.75-(43.67)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 16.75 + (((tickAnim - 6) / 5) * (7.82-(16.75)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 7.82 + (((tickAnim - 11) / 4) * (51.25-(7.82)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfrontfoot, rightfrontfoot.rotateAngleX + (float) Math.toRadians(xx), rightfrontfoot.rotateAngleY + (float) Math.toRadians(yy), rightfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 6) * (0-(0.275)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 9) * (0.275-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfrontfoot.rotationPointX = this.rightfrontfoot.rotationPointX + (float)(xx);
        this.rightfrontfoot.rotationPointY = this.rightfrontfoot.rotationPointY - (float)(yy);
        this.rightfrontfoot.rotationPointZ = this.rightfrontfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 35.5 + (((tickAnim - 0) / 6) * (-22.25-(35.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -22.25 + (((tickAnim - 6) / 9) * (35.5-(-22.25)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 67 + (((tickAnim - 0) / 2) * (-24.53-(67)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -24.53 + (((tickAnim - 2) / 1) * (-13.53-(-24.53)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -13.53 + (((tickAnim - 3) / 3) * (34.25-(-13.53)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 34.25 + (((tickAnim - 6) / 2) * (12.42-(34.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 12.42 + (((tickAnim - 8) / 4) * (25.74-(12.42)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 25.74 + (((tickAnim - 12) / 3) * (67-(25.74)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftankle, leftankle.rotateAngleX + (float) Math.toRadians(xx), leftankle.rotateAngleY + (float) Math.toRadians(yy), leftankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -22.25 + (((tickAnim - 0) / 7) * (35.5-(-22.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 35.5 + (((tickAnim - 7) / 8) * (-22.25-(35.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -30.5 + (((tickAnim - 0) / 7) * (0-(-30.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (-30.5-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 34.25 + (((tickAnim - 0) / 3) * (9.41-(34.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 9.41 + (((tickAnim - 3) / 4) * (67-(9.41)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 67 + (((tickAnim - 7) / 4) * (-16.37-(67)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -16.37 + (((tickAnim - 11) / 2) * (-7.93-(-16.37)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.93 + (((tickAnim - 13) / 2) * (34.25-(-7.93)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightankle, rightankle.rotateAngleX + (float) Math.toRadians(xx), rightankle.rotateAngleY + (float) Math.toRadians(yy), rightankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18.25 + (((tickAnim - 0) / 3) * (9.66671-(18.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.02459-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.64563-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 9.66671 + (((tickAnim - 3) / 1) * (-35.61-(9.66671)));
            yy = -1.02459 + (((tickAnim - 3) / 1) * (0-(-1.02459)));
            zz = -0.64563 + (((tickAnim - 3) / 1) * (0-(-0.64563)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -35.61 + (((tickAnim - 4) / 3) * (0-(-35.61)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (20.42-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 20.42 + (((tickAnim - 11) / 2) * (37.49-(20.42)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 37.49 + (((tickAnim - 13) / 2) * (18.25-(37.49)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthindfoot, righthindfoot.rotateAngleX + (float) Math.toRadians(xx), righthindfoot.rotateAngleY + (float) Math.toRadians(yy), righthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (-0.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -0.25 + (((tickAnim - 13) / 2) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthindfoot.rotationPointX = this.righthindfoot.rotationPointX + (float)(xx);
        this.righthindfoot.rotationPointY = this.righthindfoot.rotationPointY - (float)(yy);
        this.righthindfoot.rotationPointZ = this.righthindfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*-3), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-3));


        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-40))*4), bodymiddle.rotateAngleY + (float) Math.toRadians(0), bodymiddle.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+30))*5), bodyfront.rotateAngleY + (float) Math.toRadians(0), bodyfront.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*-4), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailbase, tailbase.rotateAngleX + (float) Math.toRadians(6.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*5), tailbase.rotateAngleY + (float) Math.toRadians(0), tailbase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-3));


        this.setRotateAngle(tailmiddle, tailmiddle.rotateAngleX + (float) Math.toRadians(0), tailmiddle.rotateAngleY + (float) Math.toRadians(0), tailmiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-3));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-30.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -30.5 + (((tickAnim - 6) / 9) * (0-(-30.5)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (28.34-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 28.34 + (((tickAnim - 2) / 1) * (28.34-(28.34)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 28.34 + (((tickAnim - 3) / 3) * (18.25-(28.34)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 18.25 + (((tickAnim - 6) / 2) * (11.42-(18.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 11.42 + (((tickAnim - 8) / 4) * (-10.01-(11.42)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -10.01 + (((tickAnim - 12) / 3) * (0-(-10.01)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthindfoot, lefthindfoot.rotateAngleX + (float) Math.toRadians(xx), lefthindfoot.rotateAngleY + (float) Math.toRadians(yy), lefthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (0.65-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.65 + (((tickAnim - 12) / 3) * (0-(0.65)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthindfoot.rotationPointX = this.lefthindfoot.rotationPointX + (float)(xx);
        this.lefthindfoot.rotationPointY = this.lefthindfoot.rotationPointY - (float)(yy);
        this.lefthindfoot.rotationPointZ = this.lefthindfoot.rotationPointZ + (float)(zz);


}

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAusktribosphenos e = (EntityPrehistoricFloraAusktribosphenos) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
