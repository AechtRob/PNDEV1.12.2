package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraNigersaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelNigersaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer bodymiddle;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer neckbase;
    private final AdvancedModelRenderer neckmiddlebase;
    private final AdvancedModelRenderer neckmiddlefront;
    private final AdvancedModelRenderer neckfront;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer lowerjawbase;
    private final AdvancedModelRenderer lowerjawmiddlebase;
    private final AdvancedModelRenderer lowerjawmiddlefront;
    private final AdvancedModelRenderer lowerjawfront;
    private final AdvancedModelRenderer lowerjawteeth;
    private final AdvancedModelRenderer lowerlip;
    private final AdvancedModelRenderer mouthslope;
    private final AdvancedModelRenderer leftmasseter;
    private final AdvancedModelRenderer rightmasseter;
    private final AdvancedModelRenderer upperjawbase;
    private final AdvancedModelRenderer upperjawmiddle;
    private final AdvancedModelRenderer upperjawfront;
    private final AdvancedModelRenderer leftupperjawside;
    private final AdvancedModelRenderer rightupperjawside;
    private final AdvancedModelRenderer upperjawteeth;
    private final AdvancedModelRenderer snoutslope;
    private final AdvancedModelRenderer headslopebase;
    private final AdvancedModelRenderer headslopemiddle;
    private final AdvancedModelRenderer headslopefront;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer neckflapfront;
    private final AdvancedModelRenderer neckskinfront;
    private final AdvancedModelRenderer neckflapmidfront;
    private final AdvancedModelRenderer neckskinmidfront;
    private final AdvancedModelRenderer neckflapmidbase;
    private final AdvancedModelRenderer neckskinmidbase;
    private final AdvancedModelRenderer rightupperarm;
    private final AdvancedModelRenderer rightlowerarm;
    private final AdvancedModelRenderer rightfrontfoot;
    private final AdvancedModelRenderer rightclaw;
    private final AdvancedModelRenderer leftupperarm;
    private final AdvancedModelRenderer leftlowerarm;
    private final AdvancedModelRenderer leftfrontfoot;
    private final AdvancedModelRenderer leftclaw;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer tail8;
    private final AdvancedModelRenderer tail9;
    private final AdvancedModelRenderer rightthigh;
    private final AdvancedModelRenderer rightshin;
    private final AdvancedModelRenderer righthindfoot;
    private final AdvancedModelRenderer leftthigh;
    private final AdvancedModelRenderer leftshin;
    private final AdvancedModelRenderer lefthindfoot;

    private ModelAnimator animator;

    public ModelNigersaurus() {
        this.textureWidth = 200;
        this.textureHeight = 200;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -9.2F, 15.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.1061F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 104, -7.5F, -11.0F, -8.0F, 15, 26, 21, 0.0F, false));

        this.bodymiddle = new AdvancedModelRenderer(this);
        this.bodymiddle.setRotationPoint(0.0F, -2.3F, -7.0F);
        this.hips.addChild(bodymiddle);
        this.setRotateAngle(bodymiddle, 0.1274F, 0.0F, 0.0F);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 0, 152, -9.5F, -9.0F, -20.0F, 19, 27, 21, 0.0F, false));

        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, -1.9F, -18.5F);
        this.bodymiddle.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.1274F, 0.0F, 0.0F);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 66, -8.0F, -7.0F, -13.0F, 16, 23, 14, 0.0F, false));

        this.neckbase = new AdvancedModelRenderer(this);
        this.neckbase.setRotationPoint(0.0F, -0.7F, -12.0F);
        this.bodyfront.addChild(neckbase);
        this.setRotateAngle(neckbase, -0.3396F, 0.0F, 0.0F);
        this.neckbase.cubeList.add(new ModelBox(neckbase, 61, 66, -4.0F, -5.5F, -11.5F, 8, 12, 14, 0.0F, false));

        this.neckmiddlebase = new AdvancedModelRenderer(this);
        this.neckmiddlebase.setRotationPoint(0.0F, -0.7F, -11.3F);
        this.neckbase.addChild(neckmiddlebase);
        this.setRotateAngle(neckmiddlebase, -0.1698F, 0.0F, 0.0F);
        this.neckmiddlebase.cubeList.add(new ModelBox(neckmiddlebase, 123, 161, -3.0F, -4.5F, -10.5F, 6, 10, 12, 0.0F, false));

        this.neckmiddlefront = new AdvancedModelRenderer(this);
        this.neckmiddlefront.setRotationPoint(0.0F, -1.0F, -10.5F);
        this.neckmiddlebase.addChild(neckmiddlefront);
        this.setRotateAngle(neckmiddlefront, -0.0637F, 0.0F, 0.0F);
        this.neckmiddlefront.cubeList.add(new ModelBox(neckmiddlefront, 101, 56, -2.5F, -3.0F, -8.5F, 5, 7, 10, 0.0F, false));

        this.neckfront = new AdvancedModelRenderer(this);
        this.neckfront.setRotationPoint(0.0F, -0.3F, -8.3F);
        this.neckmiddlefront.addChild(neckfront);
        this.setRotateAngle(neckfront, 0.2335F, 0.0F, 0.0F);
        this.neckfront.cubeList.add(new ModelBox(neckfront, 144, 103, -2.0F, -2.5F, -6.0F, 4, 6, 7, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.8F, -5.0F);
        this.neckfront.addChild(head);
        this.setRotateAngle(head, 0.1698F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 46, 0, -2.5F, -2.0F, -3.5F, 5, 5, 3, 0.0F, false));

        this.lowerjawbase = new AdvancedModelRenderer(this);
        this.lowerjawbase.setRotationPoint(0.01F, 3.0F, -0.5F);
        this.head.addChild(lowerjawbase);
        this.lowerjawbase.cubeList.add(new ModelBox(lowerjawbase, 46, 11, -2.5F, 0.0F, -3.0F, 5, 2, 3, 0.0F, false));

        this.lowerjawmiddlebase = new AdvancedModelRenderer(this);
        this.lowerjawmiddlebase.setRotationPoint(-0.01F, 0.0F, -3.0F);
        this.lowerjawbase.addChild(lowerjawmiddlebase);
        this.setRotateAngle(lowerjawmiddlebase, 0.7217F, 0.0F, 0.0F);
        this.lowerjawmiddlebase.cubeList.add(new ModelBox(lowerjawmiddlebase, 84, 10, -2.5F, 0.0F, -2.0F, 5, 2, 2, 0.0F, false));

        this.lowerjawmiddlefront = new AdvancedModelRenderer(this);
        this.lowerjawmiddlefront.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.lowerjawmiddlebase.addChild(lowerjawmiddlefront);
        this.setRotateAngle(lowerjawmiddlefront, 0.3609F, 0.0F, 0.0F);
        this.lowerjawmiddlefront.cubeList.add(new ModelBox(lowerjawmiddlefront, 54, 19, -3.0F, 0.0F, -1.0F, 6, 1, 1, 0.0F, false));

        this.lowerjawfront = new AdvancedModelRenderer(this);
        this.lowerjawfront.setRotationPoint(-0.01F, 1.0F, -1.0F);
        this.lowerjawmiddlefront.addChild(lowerjawfront);
        this.setRotateAngle(lowerjawfront, -0.2972F, 0.0F, 0.0F);
        this.lowerjawfront.cubeList.add(new ModelBox(lowerjawfront, 92, 20, -3.5F, -1.0F, -1.0F, 7, 1, 1, 0.0F, false));

        this.lowerjawteeth = new AdvancedModelRenderer(this);
        this.lowerjawteeth.setRotationPoint(0.01F, 0.0F, -1.0F);
        this.lowerjawfront.addChild(lowerjawteeth);
        this.setRotateAngle(lowerjawteeth, -0.8491F, 0.0F, 0.0F);
        this.lowerjawteeth.cubeList.add(new ModelBox(lowerjawteeth, 75, 25, -3.0F, -1.0F, -1.0F, 6, 1, 1, 0.0F, false));

        this.lowerlip = new AdvancedModelRenderer(this);
        this.lowerlip.setRotationPoint(-0.01F, 0.02F, -0.58F);
        this.lowerjawfront.addChild(lowerlip);
        this.setRotateAngle(lowerlip, -0.0494F, 0.0F, 0.0F);
        this.lowerlip.cubeList.add(new ModelBox(lowerlip, 53, 24, -3.5F, -1.0F, -1.0F, 7, 1, 1, 0.0F, false));

        this.mouthslope = new AdvancedModelRenderer(this);
        this.mouthslope.setRotationPoint(0.01F, 0.0F, -2.0F);
        this.lowerjawmiddlebase.addChild(mouthslope);
        this.setRotateAngle(mouthslope, 0.8491F, 0.0F, 0.0F);
        this.mouthslope.cubeList.add(new ModelBox(mouthslope, 74, 18, -2.5F, 0.0F, -2.0F, 5, 1, 2, 0.0F, false));

        this.leftmasseter = new AdvancedModelRenderer(this);
        this.leftmasseter.setRotationPoint(1.4F, 0.0F, -2.75F);
        this.lowerjawbase.addChild(leftmasseter);
        this.setRotateAngle(leftmasseter, -0.3183F, 0.0F, 0.0F);
        this.leftmasseter.cubeList.add(new ModelBox(leftmasseter, 28, 14, -2.0F, -3.0F, 0.0F, 3, 3, 2, 0.0F, false));

        this.rightmasseter = new AdvancedModelRenderer(this);
        this.rightmasseter.setRotationPoint(-1.4F, 0.0F, -2.74F);
        this.lowerjawbase.addChild(rightmasseter);
        this.setRotateAngle(rightmasseter, -0.3183F, 0.0F, 0.0F);
        this.rightmasseter.cubeList.add(new ModelBox(rightmasseter, 39, 20, -1.0F, -3.0F, 0.0F, 3, 3, 2, 0.0F, false));

        this.upperjawbase = new AdvancedModelRenderer(this);
        this.upperjawbase.setRotationPoint(0.0F, 3.0F, -3.5F);
        this.head.addChild(upperjawbase);
        this.setRotateAngle(upperjawbase, 0.743F, 0.0F, 0.0F);
        this.upperjawbase.cubeList.add(new ModelBox(upperjawbase, 65, 0, -2.0F, -2.0F, -2.0F, 4, 2, 4, 0.0F, false));

        this.upperjawmiddle = new AdvancedModelRenderer(this);
        this.upperjawmiddle.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.upperjawbase.addChild(upperjawmiddle);
        this.setRotateAngle(upperjawmiddle, 0.4458F, 0.0F, 0.0F);
        this.upperjawmiddle.cubeList.add(new ModelBox(upperjawmiddle, 21, 23, -2.5F, 0.0F, -2.0F, 5, 2, 2, 0.0F, false));

        this.upperjawfront = new AdvancedModelRenderer(this);
        this.upperjawfront.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.upperjawmiddle.addChild(upperjawfront);
        this.setRotateAngle(upperjawfront, 0.4458F, 0.0F, 0.0F);
        this.upperjawfront.cubeList.add(new ModelBox(upperjawfront, 23, 0, -3.5F, -1.0F, -2.0F, 7, 1, 3, 0.0F, false));

        this.leftupperjawside = new AdvancedModelRenderer(this);
        this.leftupperjawside.setRotationPoint(3.2F, -0.5F, 0.6F);
        this.upperjawfront.addChild(leftupperjawside);
        this.setRotateAngle(leftupperjawside, -0.8067F, 0.0424F, 0.3396F);
        this.leftupperjawside.cubeList.add(new ModelBox(leftupperjawside, 86, 0, -1.0F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.rightupperjawside = new AdvancedModelRenderer(this);
        this.rightupperjawside.setRotationPoint(-3.2F, -0.5F, 0.6F);
        this.upperjawfront.addChild(rightupperjawside);
        this.setRotateAngle(rightupperjawside, -0.8067F, -0.0424F, -0.3396F);
        this.rightupperjawside.cubeList.add(new ModelBox(rightupperjawside, 103, 0, 0.0F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.upperjawteeth = new AdvancedModelRenderer(this);
        this.upperjawteeth.setRotationPoint(0.0F, -0.3F, -0.95F);
        this.upperjawfront.addChild(upperjawteeth);
        this.setRotateAngle(upperjawteeth, -0.8067F, 0.0F, 0.0F);
        this.upperjawteeth.cubeList.add(new ModelBox(upperjawteeth, 54, 30, -3.0F, 0.0F, 0.0F, 6, 1, 0, 0.0F, false));

        this.snoutslope = new AdvancedModelRenderer(this);
        this.snoutslope.setRotationPoint(0.1F, 0.0F, -2.0F);
        this.upperjawmiddle.addChild(snoutslope);
        this.setRotateAngle(snoutslope, 0.7217F, 0.0F, 0.0F);
        this.snoutslope.cubeList.add(new ModelBox(snoutslope, 24, 7, -3.0F, 0.0F, -3.0F, 6, 1, 3, 0.0F, false));

        this.headslopebase = new AdvancedModelRenderer(this);
        this.headslopebase.setRotationPoint(0.0F, -2.0F, -3.5F);
        this.head.addChild(headslopebase);
        this.setRotateAngle(headslopebase, 0.743F, 0.0F, 0.0F);
        this.headslopebase.cubeList.add(new ModelBox(headslopebase, 69, 9, -1.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F, false));

        this.headslopemiddle = new AdvancedModelRenderer(this);
        this.headslopemiddle.setRotationPoint(0.01F, 0.0F, -3.0F);
        this.headslopebase.addChild(headslopemiddle);
        this.setRotateAngle(headslopemiddle, 0.2335F, 0.0F, 0.0F);
        this.headslopemiddle.cubeList.add(new ModelBox(headslopemiddle, 12, 12, -1.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.headslopefront = new AdvancedModelRenderer(this);
        this.headslopefront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.headslopemiddle.addChild(headslopefront);
        this.setRotateAngle(headslopefront, 0.522F, 0.0F, 0.0F);
        this.headslopefront.cubeList.add(new ModelBox(headslopefront, 2, 21, -2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F, false));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(2.12F, -0.6F, -1.9F);
        this.head.addChild(lefteye);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 7, 2, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(-2.12F, -0.6F, -1.9F);
        this.head.addChild(righteye);
        this.righteye.cubeList.add(new ModelBox(righteye, 15, 2, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.neckflapfront = new AdvancedModelRenderer(this);
        this.neckflapfront.setRotationPoint(0.0F, 2.1F, -5.3F);
        this.neckfront.addChild(neckflapfront);
        this.setRotateAngle(neckflapfront, -0.1911F, 0.0F, 0.0F);
        this.neckflapfront.cubeList.add(new ModelBox(neckflapfront, 139, 1, -0.5F, 0.0F, 0.0F, 1, 2, 6, 0.0F, false));

        this.neckskinfront = new AdvancedModelRenderer(this);
        this.neckskinfront.setRotationPoint(0.0F, 1.5F, 0.5F);
        this.neckflapfront.addChild(neckskinfront);
        this.setRotateAngle(neckskinfront, -0.0848F, 0.0F, 0.0F);
        this.neckskinfront.cubeList.add(new ModelBox(neckskinfront, 162, 0, 0.0F, 0.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.neckflapmidfront = new AdvancedModelRenderer(this);
        this.neckflapmidfront.setRotationPoint(0.01F, 1.5F, -6.1F);
        this.neckmiddlefront.addChild(neckflapmidfront);
        this.setRotateAngle(neckflapmidfront, -0.2335F, 0.0F, 0.0F);
        this.neckflapmidfront.cubeList.add(new ModelBox(neckflapmidfront, 146, 3, -0.5F, 0.0F, -1.0F, 1, 4, 10, 0.0F, false));

        this.neckskinmidfront = new AdvancedModelRenderer(this);
        this.neckskinmidfront.setRotationPoint(0.0F, 3.5F, -0.5F);
        this.neckflapmidfront.addChild(neckskinmidfront);
        this.setRotateAngle(neckskinmidfront, -0.0424F, 0.0F, 0.0F);
        this.neckskinmidfront.cubeList.add(new ModelBox(neckskinmidfront, 162, 0, 0.0F, 0.0F, 0.0F, 0, 1, 9, 0.0F, false));

        this.neckflapmidbase = new AdvancedModelRenderer(this);
        this.neckflapmidbase.setRotationPoint(0.0F, 3.2F, -10.4F);
        this.neckmiddlebase.addChild(neckflapmidbase);
        this.setRotateAngle(neckflapmidbase, -0.1911F, 0.0F, 0.0F);
        this.neckflapmidbase.cubeList.add(new ModelBox(neckflapmidbase, 171, 1, -0.5F, 0.0F, 0.0F, 1, 4, 12, 0.0F, false));

        this.neckskinmidbase = new AdvancedModelRenderer(this);
        this.neckskinmidbase.setRotationPoint(0.0F, 3.3F, 0.8F);
        this.neckflapmidbase.addChild(neckskinmidbase);
        this.setRotateAngle(neckskinmidbase, -0.0637F, 0.0F, 0.0F);
        this.neckskinmidbase.cubeList.add(new ModelBox(neckskinmidbase, 148, 9, 0.0F, 0.0F, 0.0F, 0, 1, 10, 0.0F, false));

        this.rightupperarm = new AdvancedModelRenderer(this);
        this.rightupperarm.setRotationPoint(-7.0F, 12.7F, -9.0F);
        this.bodyfront.addChild(rightupperarm);
        this.setRotateAngle(rightupperarm, -0.0637F, 0.0F, 0.0F);
        this.rightupperarm.cubeList.add(new ModelBox(rightupperarm, 49, 42, -4.0F, -3.5F, -3.0F, 7, 15, 8, 0.0F, false));

        this.rightlowerarm = new AdvancedModelRenderer(this);
        this.rightlowerarm.setRotationPoint(-0.5F, 10.0F, 1.1F);
        this.rightupperarm.addChild(rightlowerarm);
        this.setRotateAngle(rightlowerarm, -0.1061F, 0.0F, 0.0F);
        this.rightlowerarm.cubeList.add(new ModelBox(rightlowerarm, 142, 136, -3.0F, -0.5F, -3.0F, 6, 11, 6, 0.0F, false));

        this.rightfrontfoot = new AdvancedModelRenderer(this);
        this.rightfrontfoot.setRotationPoint(0.0F, 10.0F, -1.2F);
        this.rightlowerarm.addChild(rightfrontfoot);
        this.setRotateAngle(rightfrontfoot, 0.0213F, 0.0F, 0.0F);
        this.rightfrontfoot.cubeList.add(new ModelBox(rightfrontfoot, 169, 126, -2.5F, -1.0F, -1.5F, 5, 5, 5, 0.0F, false));

        this.rightclaw = new AdvancedModelRenderer(this);
        this.rightclaw.setRotationPoint(2.5F, 1.7F, 0.4F);
        this.rightfrontfoot.addChild(rightclaw);
        this.setRotateAngle(rightclaw, 0.2335F, 0.0F, -0.4458F);
        this.rightclaw.cubeList.add(new ModelBox(rightclaw, 145, 93, -1.0F, -1.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.leftupperarm = new AdvancedModelRenderer(this);
        this.leftupperarm.setRotationPoint(7.0F, 12.7F, -9.0F);
        this.bodyfront.addChild(leftupperarm);
        this.setRotateAngle(leftupperarm, -0.0637F, 0.0F, 0.0F);
        this.leftupperarm.cubeList.add(new ModelBox(leftupperarm, 80, 42, -3.0F, -3.5F, -3.0F, 7, 15, 8, 0.0F, false));

        this.leftlowerarm = new AdvancedModelRenderer(this);
        this.leftlowerarm.setRotationPoint(0.5F, 10.0F, 1.1F);
        this.leftupperarm.addChild(leftlowerarm);
        this.setRotateAngle(leftlowerarm, -0.1061F, 0.0F, 0.0F);
        this.leftlowerarm.cubeList.add(new ModelBox(leftlowerarm, 143, 118, -3.0F, -0.5F, -3.0F, 6, 11, 6, 0.0F, false));

        this.leftfrontfoot = new AdvancedModelRenderer(this);
        this.leftfrontfoot.setRotationPoint(0.0F, 10.0F, -1.2F);
        this.leftlowerarm.addChild(leftfrontfoot);
        this.setRotateAngle(leftfrontfoot, 0.0213F, 0.0F, 0.0F);
        this.leftfrontfoot.cubeList.add(new ModelBox(leftfrontfoot, 169, 114, -2.5F, -1.0F, -1.5F, 5, 5, 5, 0.0F, false));

        this.leftclaw = new AdvancedModelRenderer(this);
        this.leftclaw.setRotationPoint(-2.5F, 1.7F, 0.4F);
        this.leftfrontfoot.addChild(leftclaw);
        this.setRotateAngle(leftclaw, 0.2335F, 0.0F, 0.4458F);
        this.leftclaw.cubeList.add(new ModelBox(leftclaw, 145, 85, 0.0F, -1.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -4.2F, 12.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1061F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 81, 165, -5.5F, -6.5F, -1.0F, 11, 16, 19, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -1.7F, 17.5F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0213F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 39, -4.0F, -4.5F, -1.0F, 8, 10, 16, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.7F, 15.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0213F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 116, 139, -2.5F, -2.5F, -1.0F, 5, 6, 15, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.7F, 14.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0424F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 106, 74, -2.0F, -1.5F, -1.0F, 4, 4, 14, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.3F, 13.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0848F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 149, 155, -1.5F, -1.0F, -1.0F, 3, 3, 13, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.3F, 11.5F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0637F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 170, 153, -1.0F, -0.5F, -0.5F, 2, 2, 11, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.2122F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 168, 138, -0.5F, -0.5F, 0.0F, 1, 2, 10, 0.0F, false));

        this.tail8 = new AdvancedModelRenderer(this);
        this.tail8.setRotationPoint(0.01F, 0.3F, 9.5F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.4033F, 0.0F, 0.0F);
        this.tail8.cubeList.add(new ModelBox(tail8, 168, 101, -0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F, false));

        this.tail9 = new AdvancedModelRenderer(this);
        this.tail9.setRotationPoint(-0.01F, 0.0F, 8.5F);
        this.tail8.addChild(tail9);
        this.setRotateAngle(tail9, -0.2759F, 0.0F, 0.0F);
        this.tail9.cubeList.add(new ModelBox(tail9, 155, 92, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));

        this.rightthigh = new AdvancedModelRenderer(this);
        this.rightthigh.setRotationPoint(-7.0F, -1.46F, 1.0F);
        this.hips.addChild(rightthigh);
        this.setRotateAngle(rightthigh, 0.0637F, 0.0F, 0.0F);
        this.rightthigh.cubeList.add(new ModelBox(rightthigh, 73, 129, -4.5F, -3.0F, -6.5F, 8, 22, 13, 0.0F, false));

        this.rightshin = new AdvancedModelRenderer(this);
        this.rightshin.setRotationPoint(-1.0F, 19.0F, -5.0F);
        this.rightthigh.addChild(rightshin);
        this.setRotateAngle(rightshin, 0.1061F, 0.0F, 0.0F);
        this.rightshin.cubeList.add(new ModelBox(rightshin, 116, 116, -3.0F, -0.5F, 0.0F, 6, 15, 7, 0.0F, false));

        this.righthindfoot = new AdvancedModelRenderer(this);
        this.righthindfoot.setRotationPoint(0.0F, 14.0F, 3.2F);
        this.rightshin.addChild(righthindfoot);
        this.setRotateAngle(righthindfoot, -0.0637F, 0.0F, 0.0F);
        this.righthindfoot.cubeList.add(new ModelBox(righthindfoot, 142, 187, -3.5F, -1.0F, -6.0F, 7, 3, 10, 0.0F, false));

        this.leftthigh = new AdvancedModelRenderer(this);
        this.leftthigh.setRotationPoint(7.0F, -1.46F, 1.0F);
        this.hips.addChild(leftthigh);
        this.setRotateAngle(leftthigh, 0.0637F, 0.0F, 0.0F);
        this.leftthigh.cubeList.add(new ModelBox(leftthigh, 73, 93, -3.5F, -3.0F, -6.5F, 8, 22, 13, 0.0F, false));

        this.leftshin = new AdvancedModelRenderer(this);
        this.leftshin.setRotationPoint(1.0F, 19.0F, -5.0F);
        this.leftthigh.addChild(leftshin);
        this.setRotateAngle(leftshin, 0.1061F, 0.0F, 0.0F);
        this.leftshin.cubeList.add(new ModelBox(leftshin, 116, 93, -3.0F, -0.5F, 0.0F, 6, 15, 7, 0.0F, false));

        this.lefthindfoot = new AdvancedModelRenderer(this);
        this.lefthindfoot.setRotationPoint(0.0F, 14.0F, 3.2F);
        this.leftshin.addChild(lefthindfoot);
        this.setRotateAngle(lefthindfoot, -0.0637F, 0.0F, 0.0F);
        this.lefthindfoot.cubeList.add(new ModelBox(lefthindfoot, 159, 173, -3.5F, -1.0F, -6.0F, 7, 3, 10, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = 0.7F;
        this.root.offsetX = 0.1F;
        this.root.rotateAngleY = (float)Math.toRadians(210);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-4);
        this.root.scaleChildren = true;
        float scaler = 0.575F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void faceTarget(float yaw, float pitch, float rotationDivisor, AdvancedModelRenderer... boxes) {
        //Overidden as the model is kinda twisted for some reason
        float actualRotationDivisor = rotationDivisor * (float)boxes.length;
        float yawAmount = yaw / 57.295776F / actualRotationDivisor;
        float pitchAmount = pitch / 57.295776F / actualRotationDivisor;
        AdvancedModelRenderer[] var8 = boxes;
        int var9 = boxes.length;

        for(int var10 = 0; var10 < var9; ++var10) {
            AdvancedModelRenderer box = var8[var10];
            box.rotateAngleZ -= yawAmount; //would normally be Y
            box.rotateAngleY += pitchAmount; //would normally be X
        }

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
       // this.Hips.offsetY = 0.04F;
        //this.resetToDefaultPose();

        EntityPrehistoricFloraNigersaurus Nigersaurus = (EntityPrehistoricFloraNigersaurus) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neckbase,this.neckmiddlebase, this.neckmiddlefront, this.neckfront, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        Nigersaurus.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = Nigersaurus.getTravelSpeed()/2;

        if (!Nigersaurus.isInWater()) {

            if (f3 == 0.0F || !Nigersaurus.getIsMoving()) {
                if (Nigersaurus.getAnimation() != Nigersaurus.EAT_ANIMATION
                        && Nigersaurus.getAnimation() != Nigersaurus.DRINK_ANIMATION
                        && Nigersaurus.getAnimation() != Nigersaurus.ATTACK_ANIMATION) {
                    this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                }

                if (Nigersaurus.getAnimation() != Nigersaurus.ATTACK_ANIMATION) {
                    this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                    this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
                }

                return;
            }

            if (Nigersaurus.getAnimation() != Nigersaurus.EAT_ANIMATION
                    && Nigersaurus.getAnimation() != Nigersaurus.DRINK_ANIMATION
                    && Nigersaurus.getAnimation() != Nigersaurus.ATTACK_ANIMATION
                    && Nigersaurus.getAnimation() != Nigersaurus.ATTACK_ANIMATION) {
                this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
            }

            if (Nigersaurus.getIsFast()) { //Running
//                    float speed = masterSpeed / 2F;
//                    this.chainFlap(Tail, (speed * 1.2F), 0.1F, 0.5F, f2, 1F);
//                    this.chainWave(Tail, (speed * 0.6F) , 0.05F, 0.12F, f2, 1F);

            } else { //Walking
//                    float speed = masterSpeed / 1.50F;
//                    this.chainFlap(Tail, (speed * 0.5F), 0.1F, 0.2F, f2, 1F);
//                    this.chainWave(Tail, (speed * 0.5F), 0.05F * 0.65F, 0.12F, f2, 1F);
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
    


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraNigersaurus ee = (EntityPrehistoricFloraNigersaurus) entitylivingbaseIn;

        //if (!ee.isInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.TAIL_ANIMATION) { //Social/grapple/chatter (whataver you call it)
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNigersaurus entity = (EntityPrehistoricFloraNigersaurus) entitylivingbaseIn;
        int animCycle = 350;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.4-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 40) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 280) * (0-(0)));
            zz = 0.4 + (((tickAnim - 40) / 280) * (0.4-(0.4)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0.4 + (((tickAnim - 320) / 30) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 320) {
            xx = 3.5 + (((tickAnim - 40) / 280) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 40) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 280) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 3.5 + (((tickAnim - 320) / 30) * (0-(3.5)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 320) {
            xx = 4 + (((tickAnim - 40) / 280) * (4-(4)));
            yy = 0 + (((tickAnim - 40) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 280) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 4 + (((tickAnim - 320) / 30) * (0-(4)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (16.05-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 51) {
            xx = 16.05 + (((tickAnim - 40) / 11) * (19.75-(16.05)));
            yy = 0 + (((tickAnim - 40) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 11) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = 19.75 + (((tickAnim - 51) / 8) * (18.25005-(19.75)));
            yy = 0 + (((tickAnim - 51) / 8) * (0.01056-(0)));
            zz = 0 + (((tickAnim - 51) / 8) * (0.49989-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 67) {
            xx = 18.25005 + (((tickAnim - 59) / 8) * (17.7502-(18.25005)));
            yy = 0.01056 + (((tickAnim - 59) / 8) * (0.02548-(0.01056)));
            zz = 0.49989 + (((tickAnim - 59) / 8) * (0.99967-(0.49989)));
        }
        else if (tickAnim >= 67 && tickAnim < 83) {
            xx = 17.7502 + (((tickAnim - 67) / 16) * (22.2502-(17.7502)));
            yy = 0.02548 + (((tickAnim - 67) / 16) * (0.02548-(0.02548)));
            zz = 0.99967 + (((tickAnim - 67) / 16) * (0.99967-(0.99967)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
            xx = 22.2502 + (((tickAnim - 83) / 5) * (21.2002-(22.2502)));
            yy = 0.02548 + (((tickAnim - 83) / 5) * (0.02548-(0.02548)));
            zz = 0.99967 + (((tickAnim - 83) / 5) * (0.99967-(0.99967)));
        }
        else if (tickAnim >= 88 && tickAnim < 105) {
            xx = 21.2002 + (((tickAnim - 88) / 17) * (16.5415+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(21.2002)));
            yy = 0.02548 + (((tickAnim - 88) / 17) * (2.86058-(0.02548)));
            zz = 0.99967 + (((tickAnim - 88) / 17) * (1.70572-(0.99967)));
        }






        if (tickAnim >= 171 && tickAnim < 208) {
            xx = 9.1915+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 171) / 37) * (7.9415+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*-2-(9.1915+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            yy = 2.86058 + (((tickAnim - 171) / 37) * (2.86058-(2.86058)));
            zz = 1.70572 + (((tickAnim - 171) / 37) * (1.70572-(1.70572)));
        }
        else if (tickAnim >= 208 && tickAnim < 263) {
            xx = 7.9415+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*-2 + (((tickAnim - 208) / 55) * (22.2502-(7.9415+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*-2)));
            yy = 2.86058 + (((tickAnim - 208) / 55) * (0.02548-(2.86058)));
            zz = 1.70572 + (((tickAnim - 208) / 55) * (0.99967-(1.70572)));
        }
        else if (tickAnim >= 263 && tickAnim < 290) {
            xx = 22.2502 + (((tickAnim - 263) / 27) * (20.9252+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*5-(22.2502)));
            yy = 0.02548 + (((tickAnim - 263) / 27) * (0.02548-(0.02548)));
            zz = 0.99967 + (((tickAnim - 263) / 27) * (0.99967-(0.99967)));
        }
        else if (tickAnim >= 290 && tickAnim < 299) {
            xx = 20.9252+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*5 + (((tickAnim - 290) / 9) * (18.2502-(20.9252+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*5)));
            yy = 0.02548 + (((tickAnim - 290) / 9) * (0.02548-(0.02548)));
            zz = 0.99967 + (((tickAnim - 290) / 9) * (0.99967-(0.99967)));
        }
        else if (tickAnim >= 299 && tickAnim < 320) {
            xx = 18.2502 + (((tickAnim - 299) / 21) * (22.3252-(18.2502)));
            yy = 0.02548 + (((tickAnim - 299) / 21) * (0.02548-(0.02548)));
            zz = 0.99967 + (((tickAnim - 299) / 21) * (0.99967-(0.99967)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 22.3252 + (((tickAnim - 320) / 30) * (0-(22.3252)));
            yy = 0.02548 + (((tickAnim - 320) / 30) * (0-(0.02548)));
            zz = 0.99967 + (((tickAnim - 320) / 30) * (0-(0.99967)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (20.6-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 20.6 + (((tickAnim - 40) / 10) * (24.5-(20.6)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 59) {
            xx = 24.5 + (((tickAnim - 50) / 9) * (16.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-5-(24.5)));
            yy = 0 + (((tickAnim - 50) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 9) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 67) {
            xx = 16.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-5 + (((tickAnim - 59) / 8) * (20.75-(16.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-5)));
            yy = 0 + (((tickAnim - 59) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 8) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 83) {
            xx = 20.75 + (((tickAnim - 67) / 16) * (24.25-(20.75)));
            yy = 0 + (((tickAnim - 67) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 16) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
            xx = 24.25 + (((tickAnim - 83) / 5) * (23.75-(24.25)));
            yy = 0 + (((tickAnim - 83) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 5) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 171) {
            xx = 23.75 + (((tickAnim - 88) / 83) * (4.4779+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(23.75)));
            yy = 0 + (((tickAnim - 88) / 83) * (0.74997-(0)));
            zz = 0 + (((tickAnim - 88) / 83) * (0.00681-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 208) {
            xx = 4.4779+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 171) / 37) * (2.8029+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*2-(4.4779+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            yy = 0.74997 + (((tickAnim - 171) / 37) * (0.74997-(0.74997)));
            zz = 0.00681 + (((tickAnim - 171) / 37) * (0.00681-(0.00681)));
        }
        else if (tickAnim >= 208 && tickAnim < 263) {
            xx = 2.8029+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*2 + (((tickAnim - 208) / 55) * (24.25-(2.8029+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*2)));
            yy = 0.74997 + (((tickAnim - 208) / 55) * (0-(0.74997)));
            zz = 0.00681 + (((tickAnim - 208) / 55) * (0-(0.00681)));
        }
        else if (tickAnim >= 263 && tickAnim < 275) {
            xx = 24.25 + (((tickAnim - 263) / 12) * (23.5-(24.25)));
            yy = 0 + (((tickAnim - 263) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 12) * (0-(0)));
        }
        else if (tickAnim >= 275 && tickAnim < 290) {
            xx = 23.5 + (((tickAnim - 275) / 15) * (21.25-(23.5)));
            yy = 0 + (((tickAnim - 275) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 275) / 15) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 299) {
            xx = 21.25 + (((tickAnim - 290) / 9) * (22.5-(21.25)));
            yy = 0 + (((tickAnim - 290) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 9) * (0-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 320) {
            xx = 22.5 + (((tickAnim - 299) / 21) * (27.375-(22.5)));
            yy = 0 + (((tickAnim - 299) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 299) / 21) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 27.375 + (((tickAnim - 320) / 30) * (0-(27.375)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 22.75 + (((tickAnim - 40) / 10) * (21.5-(22.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 59) {
            xx = 21.5 + (((tickAnim - 50) / 9) * (11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-5-(21.5)));
            yy = 0 + (((tickAnim - 50) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 9) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 67) {
            xx = 11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-5 + (((tickAnim - 59) / 8) * (14-(11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-5)));
            yy = 0 + (((tickAnim - 59) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 8) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 83) {
            xx = 14 + (((tickAnim - 67) / 16) * (19.5-(14)));
            yy = 0 + (((tickAnim - 67) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 16) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
            xx = 19.5 + (((tickAnim - 83) / 5) * (18.75-(19.5)));
            yy = 0 + (((tickAnim - 83) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 5) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 132) {
            xx = 18.75 + (((tickAnim - 88) / 44) * (7.1529+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(18.75)));
            yy = 0 + (((tickAnim - 88) / 44) * (4.74948-(0)));
            zz = 0 + (((tickAnim - 88) / 44) * (0.07063-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 208) {
            xx = 7.1529+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 132) / 76) * (0.8279+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2-(7.1529+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 4.74948 + (((tickAnim - 132) / 76) * (4.74948-(4.74948)));
            zz = 0.07063 + (((tickAnim - 132) / 76) * (0.07063-(0.07063)));
        }
        else if (tickAnim >= 208 && tickAnim < 263) {
            xx = 0.8279+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2 + (((tickAnim - 208) / 55) * (19.5-(0.8279+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2)));
            yy = 4.74948 + (((tickAnim - 208) / 55) * (0-(4.74948)));
            zz = 0.07063 + (((tickAnim - 208) / 55) * (0-(0.07063)));
        }
        else if (tickAnim >= 263 && tickAnim < 275) {
            xx = 19.5 + (((tickAnim - 263) / 12) * (18-(19.5)));
            yy = 0 + (((tickAnim - 263) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 12) * (0-(0)));
        }
        else if (tickAnim >= 275 && tickAnim < 290) {
            xx = 18 + (((tickAnim - 275) / 15) * (15.25-(18)));
            yy = 0 + (((tickAnim - 275) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 275) / 15) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 299) {
            xx = 15.25 + (((tickAnim - 290) / 9) * (16.75-(15.25)));
            yy = 0 + (((tickAnim - 290) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 9) * (0-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 320) {
            xx = 16.75 + (((tickAnim - 299) / 21) * (19-(16.75)));
            yy = 0 + (((tickAnim - 299) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 299) / 21) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 19 + (((tickAnim - 320) / 30) * (0-(19)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 40) / 10) * (0.75-(2.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 59) {
            xx = 0.75 + (((tickAnim - 50) / 9) * (3.23504-(0.75)));
            yy = 0 + (((tickAnim - 50) / 9) * (-0.71527-(0)));
            zz = 0 + (((tickAnim - 50) / 9) * (2.39556-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 67) {
            xx = 3.23504 + (((tickAnim - 59) / 8) * (3.97847-(3.23504)));
            yy = -0.71527 + (((tickAnim - 59) / 8) * (-0.86447-(-0.71527)));
            zz = 2.39556 + (((tickAnim - 59) / 8) * (2.87282-(2.39556)));
        }
        else if (tickAnim >= 67 && tickAnim < 83) {
            xx = 3.97847 + (((tickAnim - 67) / 16) * (0.47847-(3.97847)));
            yy = -0.86447 + (((tickAnim - 67) / 16) * (-0.86447-(-0.86447)));
            zz = 2.87282 + (((tickAnim - 67) / 16) * (2.87282-(2.87282)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
            xx = 0.47847 + (((tickAnim - 83) / 5) * (1.97847-(0.47847)));
            yy = -0.86447 + (((tickAnim - 83) / 5) * (-0.86447-(-0.86447)));
            zz = 2.87282 + (((tickAnim - 83) / 5) * (2.87282-(2.87282)));
        }
        else if (tickAnim >= 88 && tickAnim < 117) {
            xx = 1.97847 + (((tickAnim - 88) / 29) * (-11.77867-(1.97847)));
            yy = -0.86447 + (((tickAnim - 88) / 29) * (3.37304-(-0.86447)));
            zz = 2.87282 + (((tickAnim - 88) / 29) * (2.54712-(2.87282)));
        }
        else if (tickAnim >= 117 && tickAnim < 208) {
            xx = -11.77867 + (((tickAnim - 117) / 91) * (-13.49744-(-11.77867)));
            yy = 3.37304 + (((tickAnim - 117) / 91) * (0.33721-(3.37304)));
            zz = 2.54712 + (((tickAnim - 117) / 91) * (2.78046-(2.54712)));
        }
        else if (tickAnim >= 208 && tickAnim < 263) {
            xx = -13.49744 + (((tickAnim - 208) / 55) * (-5.52153-(-13.49744)));
            yy = 0.33721 + (((tickAnim - 208) / 55) * (-0.86447-(0.33721)));
            zz = 2.78046 + (((tickAnim - 208) / 55) * (2.87282-(2.78046)));
        }
        else if (tickAnim >= 263 && tickAnim < 290) {
            xx = -5.52153 + (((tickAnim - 263) / 27) * (3.72847-(-5.52153)));
            yy = -0.86447 + (((tickAnim - 263) / 27) * (-0.86447-(-0.86447)));
            zz = 2.87282 + (((tickAnim - 263) / 27) * (2.87282-(2.87282)));
        }
        else if (tickAnim >= 290 && tickAnim < 299) {
            xx = 3.72847 + (((tickAnim - 290) / 9) * (3.22847-(3.72847)));
            yy = -0.86447 + (((tickAnim - 290) / 9) * (-0.86447-(-0.86447)));
            zz = 2.87282 + (((tickAnim - 290) / 9) * (2.87282-(2.87282)));
        }
        else if (tickAnim >= 299 && tickAnim < 320) {
            xx = 3.22847 + (((tickAnim - 299) / 21) * (-0.52153-(3.22847)));
            yy = -0.86447 + (((tickAnim - 299) / 21) * (-0.86447-(-0.86447)));
            zz = 2.87282 + (((tickAnim - 299) / 21) * (2.87282-(2.87282)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = -0.52153 + (((tickAnim - 320) / 30) * (0-(-0.52153)));
            yy = -0.86447 + (((tickAnim - 320) / 30) * (0-(-0.86447)));
            zz = 2.87282 + (((tickAnim - 320) / 30) * (0-(2.87282)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(xx), neckfront.rotateAngleY + (float) Math.toRadians(yy), neckfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -14 + (((tickAnim - 40) / 5) * (-14-(-14)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -14 + (((tickAnim - 45) / 5) * (-7-(-14)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 59) {
            xx = -7 + (((tickAnim - 50) / 9) * (5.04553-(-7)));
            yy = 0 + (((tickAnim - 50) / 9) * (-1.00694-(0)));
            zz = 0 + (((tickAnim - 50) / 9) * (3.3522-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 67) {
            xx = 5.04553 + (((tickAnim - 59) / 8) * (8.46154-(5.04553)));
            yy = -1.00694 + (((tickAnim - 59) / 8) * (-1.16308-(-1.00694)));
            zz = 3.3522 + (((tickAnim - 59) / 8) * (3.82728-(3.3522)));
        }
        else if (tickAnim >= 67 && tickAnim < 83) {
            xx = 8.46154 + (((tickAnim - 67) / 16) * (-11.53846-(8.46154)));
            yy = -1.16308 + (((tickAnim - 67) / 16) * (-1.16308-(-1.16308)));
            zz = 3.82728 + (((tickAnim - 67) / 16) * (3.82728-(3.82728)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
            xx = -11.53846 + (((tickAnim - 83) / 5) * (-9.53846-(-11.53846)));
            yy = -1.16308 + (((tickAnim - 83) / 5) * (-1.16308-(-1.16308)));
            zz = 3.82728 + (((tickAnim - 83) / 5) * (3.82728-(3.82728)));
        }
        else if (tickAnim >= 88 && tickAnim < 95) {
            xx = -9.53846 + (((tickAnim - 88) / 7) * (-4.088+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*18-(-9.53846)));
            yy = -1.16308 + (((tickAnim - 88) / 7) * (0.66192-(-1.16308)));
            zz = 3.82728 + (((tickAnim - 88) / 7) * (3.82728-(3.82728)));
        }
        else if (tickAnim >= 95 && tickAnim < 119) {
            xx = -4.088+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*18 + (((tickAnim - 95) / 24) * (-6.03988-(-4.088+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*18)));
            yy = 0.66192 + (((tickAnim - 95) / 24) * (3.58645-(0.66192)));
            zz = 3.82728 + (((tickAnim - 95) / 24) * (3.7602-(3.82728)));
        }
        else if (tickAnim >= 119 && tickAnim < 208) {
            xx = -6.03988 + (((tickAnim - 119) / 89) * (2.05655-(-6.03988)));
            yy = 3.58645 + (((tickAnim - 119) / 89) * (0.21465-(3.58645)));
            zz = 3.7602 + (((tickAnim - 119) / 89) * (3.80782-(3.7602)));
        }
        else if (tickAnim >= 208 && tickAnim < 263) {
            xx = 2.05655 + (((tickAnim - 208) / 55) * (-11.53846-(2.05655)));
            yy = 0.21465 + (((tickAnim - 208) / 55) * (-1.16308-(0.21465)));
            zz = 3.80782 + (((tickAnim - 208) / 55) * (3.82728-(3.80782)));
        }
        else if (tickAnim >= 263 && tickAnim < 275) {
            xx = -11.53846 + (((tickAnim - 263) / 12) * (-5.28846-(-11.53846)));
            yy = -1.16308 + (((tickAnim - 263) / 12) * (-1.16308-(-1.16308)));
            zz = 3.82728 + (((tickAnim - 263) / 12) * (3.82728-(3.82728)));
        }
        else if (tickAnim >= 275 && tickAnim < 290) {
            xx = -5.28846 + (((tickAnim - 275) / 15) * (2.21154-(-5.28846)));
            yy = -1.16308 + (((tickAnim - 275) / 15) * (-1.16308-(-1.16308)));
            zz = 3.82728 + (((tickAnim - 275) / 15) * (3.82728-(3.82728)));
        }
        else if (tickAnim >= 290 && tickAnim < 299) {
            xx = 2.21154 + (((tickAnim - 290) / 9) * (-0.28846-(2.21154)));
            yy = -1.16308 + (((tickAnim - 290) / 9) * (-1.16308-(-1.16308)));
            zz = 3.82728 + (((tickAnim - 290) / 9) * (3.82728-(3.82728)));
        }
        else if (tickAnim >= 299 && tickAnim < 315) {
            xx = -0.28846 + (((tickAnim - 299) / 16) * (-10.73846-(-0.28846)));
            yy = -1.16308 + (((tickAnim - 299) / 16) * (-1.16308-(-1.16308)));
            zz = 3.82728 + (((tickAnim - 299) / 16) * (3.82728-(3.82728)));
        }
        else if (tickAnim >= 315 && tickAnim < 320) {
            xx = -10.73846 + (((tickAnim - 315) / 5) * (-7.78846-(-10.73846)));
            yy = -1.16308 + (((tickAnim - 315) / 5) * (-1.16308-(-1.16308)));
            zz = 3.82728 + (((tickAnim - 315) / 5) * (3.82728-(3.82728)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = -7.78846 + (((tickAnim - 320) / 30) * (0-(-7.78846)));
            yy = -1.16308 + (((tickAnim - 320) / 30) * (0-(-1.16308)));
            zz = 3.82728 + (((tickAnim - 320) / 30) * (0-(3.82728)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (26.75-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 26.75 + (((tickAnim - 45) / 5) * (0-(26.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 50) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 22) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 72) / 6) * (27.25-(0)));
            yy = 0 + (((tickAnim - 72) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 6) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 27.25 + (((tickAnim - 78) / 5) * (0-(27.25)));
            yy = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 5) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 83) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 7) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 90) / 3) * (7.25-(0)));
            yy = 0 + (((tickAnim - 90) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 3) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 97) {
            xx = 7.25 + (((tickAnim - 93) / 4) * (0-(7.25)));
            yy = 0 + (((tickAnim - 93) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 4) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 252) {
            xx = 0 + (((tickAnim - 97) / 155) * (0-(0)));
            yy = 0 + (((tickAnim - 97) / 155) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 155) * (0-(0)));
        }
        else if (tickAnim >= 252 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 252) / 6) * (27.25-(0)));
            yy = 0 + (((tickAnim - 252) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 252) / 6) * (0-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 263) {
            xx = 27.25 + (((tickAnim - 258) / 5) * (0-(27.25)));
            yy = 0 + (((tickAnim - 258) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 258) / 5) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 263) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 263) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 45) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 308) / 7) * (27.25-(0)));
            yy = 0 + (((tickAnim - 308) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 7) * (0-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 320) {
            xx = 27.25 + (((tickAnim - 315) / 5) * (0-(27.25)));
            yy = 0 + (((tickAnim - 315) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 315) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawbase, lowerjawbase.rotateAngleX + (float) Math.toRadians(xx), lowerjawbase.rotateAngleY + (float) Math.toRadians(yy), lowerjawbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 50 && tickAnim < 54) {
            xx = 1 + (((tickAnim - 50) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 50) / 4) * (0.02-(1)));
            zz = 1 + (((tickAnim - 50) / 4) * (1-(1)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = 1 + (((tickAnim - 54) / 4) * (1-(1)));
            yy = 0.02 + (((tickAnim - 54) / 4) * (1-(0.02)));
            zz = 1 + (((tickAnim - 54) / 4) * (1-(1)));
        }
        else if (tickAnim >= 58 && tickAnim < 90) {
            xx = 1 + (((tickAnim - 58) / 32) * (1-(1)));
            yy = 1 + (((tickAnim - 58) / 32) * (1-(1)));
            zz = 1 + (((tickAnim - 58) / 32) * (1-(1)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = 1 + (((tickAnim - 90) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 90) / 3) * (0-(1)));
            zz = 1 + (((tickAnim - 90) / 3) * (1-(1)));
        }
        else if (tickAnim >= 93 && tickAnim < 97) {
            xx = 1 + (((tickAnim - 93) / 4) * (1-(1)));
            yy = 0 + (((tickAnim - 93) / 4) * (1-(0)));
            zz = 1 + (((tickAnim - 93) / 4) * (1-(1)));
        }
        else if (tickAnim >= 97 && tickAnim < 151) {
            xx = 1 + (((tickAnim - 97) / 54) * (1-(1)));
            yy = 1 + (((tickAnim - 97) / 54) * (1-(1)));
            zz = 1 + (((tickAnim - 97) / 54) * (1-(1)));
        }
        else if (tickAnim >= 151 && tickAnim < 154) {
            xx = 1 + (((tickAnim - 151) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 151) / 3) * (0-(1)));
            zz = 1 + (((tickAnim - 151) / 3) * (1-(1)));
        }
        else if (tickAnim >= 154 && tickAnim < 158) {
            xx = 1 + (((tickAnim - 154) / 4) * (1-(1)));
            yy = 0 + (((tickAnim - 154) / 4) * (1-(0)));
            zz = 1 + (((tickAnim - 154) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.lefteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 50 && tickAnim < 54) {
            xx = 1 + (((tickAnim - 50) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 50) / 4) * (0.02-(1)));
            zz = 1 + (((tickAnim - 50) / 4) * (1-(1)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = 1 + (((tickAnim - 54) / 4) * (1-(1)));
            yy = 0.02 + (((tickAnim - 54) / 4) * (1-(0.02)));
            zz = 1 + (((tickAnim - 54) / 4) * (1-(1)));
        }
        else if (tickAnim >= 58 && tickAnim < 90) {
            xx = 1 + (((tickAnim - 58) / 32) * (1-(1)));
            yy = 1 + (((tickAnim - 58) / 32) * (1-(1)));
            zz = 1 + (((tickAnim - 58) / 32) * (1-(1)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = 1 + (((tickAnim - 90) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 90) / 3) * (0-(1)));
            zz = 1 + (((tickAnim - 90) / 3) * (1-(1)));
        }
        else if (tickAnim >= 93 && tickAnim < 97) {
            xx = 1 + (((tickAnim - 93) / 4) * (1-(1)));
            yy = 0 + (((tickAnim - 93) / 4) * (1-(0)));
            zz = 1 + (((tickAnim - 93) / 4) * (1-(1)));
        }
        else if (tickAnim >= 97 && tickAnim < 151) {
            xx = 1 + (((tickAnim - 97) / 54) * (1-(1)));
            yy = 1 + (((tickAnim - 97) / 54) * (1-(1)));
            zz = 1 + (((tickAnim - 97) / 54) * (1-(1)));
        }
        else if (tickAnim >= 151 && tickAnim < 154) {
            xx = 1 + (((tickAnim - 151) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 151) / 3) * (0-(1)));
            zz = 1 + (((tickAnim - 151) / 3) * (1-(1)));
        }
        else if (tickAnim >= 154 && tickAnim < 158) {
            xx = 1 + (((tickAnim - 154) / 4) * (1-(1)));
            yy = 0 + (((tickAnim - 154) / 4) * (1-(0)));
            zz = 1 + (((tickAnim - 154) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.righteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 320) {
            xx = -21.25 + (((tickAnim - 40) / 280) * (-21.25-(-21.25)));
            yy = 0 + (((tickAnim - 40) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 280) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = -21.25 + (((tickAnim - 320) / 30) * (0-(-21.25)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightupperarm.rotationPointX = this.rightupperarm.rotationPointX + (float)(0);
        this.rightupperarm.rotationPointY = this.rightupperarm.rotationPointY - (float)(0);
        this.rightupperarm.rotationPointZ = this.rightupperarm.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 320) {
            xx = -15.75 + (((tickAnim - 40) / 280) * (-15.75-(-15.75)));
            yy = 0 + (((tickAnim - 40) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 280) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = -15.75 + (((tickAnim - 320) / 30) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightlowerarm.rotationPointX = this.rightlowerarm.rotationPointX + (float)(0);
        this.rightlowerarm.rotationPointY = this.rightlowerarm.rotationPointY - (float)(0);
        this.rightlowerarm.rotationPointZ = this.rightlowerarm.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 320) {
            xx = 27.5 + (((tickAnim - 40) / 280) * (27.5-(27.5)));
            yy = 0 + (((tickAnim - 40) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 280) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 27.5 + (((tickAnim - 320) / 30) * (0-(27.5)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfrontfoot, rightfrontfoot.rotateAngleX + (float) Math.toRadians(xx), rightfrontfoot.rotateAngleY + (float) Math.toRadians(yy), rightfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightfrontfoot.rotationPointX = this.rightfrontfoot.rotationPointX + (float)(0);
        this.rightfrontfoot.rotationPointY = this.rightfrontfoot.rotationPointY - (float)(0);
        this.rightfrontfoot.rotationPointZ = this.rightfrontfoot.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 26 + (((tickAnim - 21) / 19) * (16.5-(26)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 320) {
            xx = 16.5 + (((tickAnim - 40) / 280) * (16.5-(16.5)));
            yy = 0 + (((tickAnim - 40) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 280) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 16.5 + (((tickAnim - 320) / 30) * (0-(16.5)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftupperarm.rotationPointX = this.leftupperarm.rotationPointX + (float)(0);
        this.leftupperarm.rotationPointY = this.leftupperarm.rotationPointY - (float)(0);
        this.leftupperarm.rotationPointZ = this.leftupperarm.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-41.5-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -41.5 + (((tickAnim - 21) / 19) * (-14.26281-(-41.5)));
            yy = 0 + (((tickAnim - 21) / 19) * (0.1206-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (-0.54642-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 320) {
            xx = -14.26281 + (((tickAnim - 40) / 280) * (-14.26281-(-14.26281)));
            yy = 0.1206 + (((tickAnim - 40) / 280) * (0.1206-(0.1206)));
            zz = -0.54642 + (((tickAnim - 40) / 280) * (-0.54642-(-0.54642)));
        }
        else if (tickAnim >= 320 && tickAnim < 334) {
            xx = -14.26281 + (((tickAnim - 320) / 14) * (-45.77759-(-14.26281)));
            yy = 0.1206 + (((tickAnim - 320) / 14) * (0.06365-(0.1206)));
            zz = -0.54642 + (((tickAnim - 320) / 14) * (-0.28839-(-0.54642)));
        }
        else if (tickAnim >= 334 && tickAnim < 350) {
            xx = -45.77759 + (((tickAnim - 334) / 16) * (0-(-45.77759)));
            yy = 0.06365 + (((tickAnim - 334) / 16) * (0-(0.06365)));
            zz = -0.28839 + (((tickAnim - 334) / 16) * (0-(-0.28839)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 19) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 40) / 280) * (0-(0)));
            yy = -0.475 + (((tickAnim - 40) / 280) * (-0.475-(-0.475)));
            zz = 0 + (((tickAnim - 40) / 280) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 334) {
            xx = 0 + (((tickAnim - 320) / 14) * (0-(0)));
            yy = -0.475 + (((tickAnim - 320) / 14) * (0.475-(-0.475)));
            zz = 0 + (((tickAnim - 320) / 14) * (0.5-(0)));
        }
        else if (tickAnim >= 334 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 334) / 16) * (0-(0)));
            yy = 0.475 + (((tickAnim - 334) / 16) * (0-(0.475)));
            zz = 0.5 + (((tickAnim - 334) / 16) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftlowerarm.rotationPointX = this.leftlowerarm.rotationPointX + (float)(xx);
        this.leftlowerarm.rotationPointY = this.leftlowerarm.rotationPointY - (float)(yy);
        this.leftlowerarm.rotationPointZ = this.leftlowerarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (36.75-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 36.75 + (((tickAnim - 21) / 19) * (2.25-(36.75)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 320) {
            xx = 2.25 + (((tickAnim - 40) / 280) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 40) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 280) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 334) {
            xx = 2.25 + (((tickAnim - 320) / 14) * (51.44-(2.25)));
            yy = 0 + (((tickAnim - 320) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 14) * (0-(0)));
        }
        else if (tickAnim >= 334 && tickAnim < 350) {
            xx = 51.44 + (((tickAnim - 334) / 16) * (0-(51.44)));
            yy = 0 + (((tickAnim - 334) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 334) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfrontfoot, leftfrontfoot.rotateAngleX + (float) Math.toRadians(xx), leftfrontfoot.rotateAngleY + (float) Math.toRadians(yy), leftfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 40 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 40) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 280) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfrontfoot.rotationPointX = this.leftfrontfoot.rotationPointX + (float)(xx);
        this.leftfrontfoot.rotationPointY = this.leftfrontfoot.rotationPointY - (float)(yy);
        this.leftfrontfoot.rotationPointZ = this.leftfrontfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -2.25 + (((tickAnim - 40) / 30) * (-1.25-(-2.25)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 195) {
            xx = -1.25 + (((tickAnim - 70) / 125) * (2.3-(-1.25)));
            yy = 0 + (((tickAnim - 70) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 125) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 320) {
            xx = 2.3 + (((tickAnim - 195) / 125) * (-2.25-(2.3)));
            yy = 0 + (((tickAnim - 195) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 125) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = -2.25 + (((tickAnim - 320) / 30) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -3 + (((tickAnim - 40) / 30) * (-3.25-(-3)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 195) {
            xx = -3.25 + (((tickAnim - 70) / 125) * (-3.14-(-3.25)));
            yy = 0 + (((tickAnim - 70) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 125) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 320) {
            xx = -3.14 + (((tickAnim - 195) / 125) * (-3-(-3.14)));
            yy = 0 + (((tickAnim - 195) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 125) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = -3 + (((tickAnim - 320) / 30) * (0-(-3)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 2.75 + (((tickAnim - 40) / 30) * (1-(2.75)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 139) {
            xx = 1 + (((tickAnim - 70) / 69) * (-1.16-(1)));
            yy = 0 + (((tickAnim - 70) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 69) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 195) {
            xx = -1.16 + (((tickAnim - 139) / 56) * (0.54-(-1.16)));
            yy = 0 + (((tickAnim - 139) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 56) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 320) {
            xx = 0.54 + (((tickAnim - 195) / 125) * (2.75-(0.54)));
            yy = 0 + (((tickAnim - 195) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 125) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 2.75 + (((tickAnim - 320) / 30) * (0-(2.75)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 8.25 + (((tickAnim - 40) / 30) * (5-(8.25)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 139) {
            xx = 5 + (((tickAnim - 70) / 69) * (3.14-(5)));
            yy = 0 + (((tickAnim - 70) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 69) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 195) {
            xx = 3.14 + (((tickAnim - 139) / 56) * (-0.69-(3.14)));
            yy = 0 + (((tickAnim - 139) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 56) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 320) {
            xx = -0.69 + (((tickAnim - 195) / 125) * (8.25-(-0.69)));
            yy = 0 + (((tickAnim - 195) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 125) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 8.25 + (((tickAnim - 320) / 30) * (0-(8.25)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 10.25 + (((tickAnim - 40) / 30) * (7-(10.25)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 139) {
            xx = 7 + (((tickAnim - 70) / 69) * (-5.61-(7)));
            yy = 0 + (((tickAnim - 70) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 69) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 195) {
            xx = -5.61 + (((tickAnim - 139) / 56) * (-11.26-(-5.61)));
            yy = 0 + (((tickAnim - 139) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 56) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 320) {
            xx = -11.26 + (((tickAnim - 195) / 125) * (10.25-(-11.26)));
            yy = 0 + (((tickAnim - 195) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 125) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 10.25 + (((tickAnim - 320) / 30) * (0-(10.25)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -13.5 + (((tickAnim - 40) / 30) * (-8.25-(-13.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 139) {
            xx = -8.25 + (((tickAnim - 70) / 69) * (-11.03-(-8.25)));
            yy = 0 + (((tickAnim - 70) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 69) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 320) {
            xx = -11.03 + (((tickAnim - 139) / 181) * (-13.5-(-11.03)));
            yy = 0 + (((tickAnim - 139) / 181) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 181) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = -13.5 + (((tickAnim - 320) / 30) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 350) {
            xx = 3 + (((tickAnim - 70) / 280) * (0-(3)));
            yy = 0 + (((tickAnim - 70) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 280) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 320) {
            xx = 1.75 + (((tickAnim - 40) / 280) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 40) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 280) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 1.75 + (((tickAnim - 320) / 30) * (0-(1.75)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 320) {
            xx = -1.25 + (((tickAnim - 40) / 280) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 40) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 280) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = -1.25 + (((tickAnim - 320) / 30) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(0), leftshin.rotateAngleY + (float) Math.toRadians(0), leftshin.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 40) / 280) * (0-(0)));
            yy = -0.3 + (((tickAnim - 40) / 280) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 40) / 280) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            yy = -0.3 + (((tickAnim - 320) / 30) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftshin.rotationPointX = this.leftshin.rotationPointX + (float)(xx);
        this.leftshin.rotationPointY = this.leftshin.rotationPointY - (float)(yy);
        this.leftshin.rotationPointZ = this.leftshin.rotationPointZ + (float)(zz);



        this.lefthindfoot.rotationPointX = this.lefthindfoot.rotationPointX + (float)(0);
        this.lefthindfoot.rotationPointY = this.lefthindfoot.rotationPointY - (float)(0);
        this.lefthindfoot.rotationPointZ = this.lefthindfoot.rotationPointZ + (float)(0);

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNigersaurus entity = (EntityPrehistoricFloraNigersaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 18.5 + (((tickAnim - 18) / 15) * (-16.68-(18.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -16.68 + (((tickAnim - 33) / 17) * (0-(-16.68)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (4.5-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 4.5 + (((tickAnim - 25) / 8) * (2.25-(4.5)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 2.25 + (((tickAnim - 33) / 17) * (0-(2.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (2-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (-0.65-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 2 + (((tickAnim - 25) / 8) * (-0.5-(2)));
            zz = -0.65 + (((tickAnim - 25) / 8) * (0-(-0.65)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -0.5 + (((tickAnim - 33) / 17) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftshin.rotationPointX = this.leftshin.rotationPointX + (float)(xx);
        this.leftshin.rotationPointY = this.leftshin.rotationPointY - (float)(yy);
        this.leftshin.rotationPointZ = this.leftshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (20.38-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 20.38 + (((tickAnim - 25) / 6) * (8.75-(20.38)));
            yy = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 8.75 + (((tickAnim - 31) / 2) * (14.5-(8.75)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 14.5 + (((tickAnim - 33) / 17) * (0-(14.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthindfoot, lefthindfoot.rotateAngleX + (float) Math.toRadians(xx), lefthindfoot.rotateAngleY + (float) Math.toRadians(yy), lefthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (1.265-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            yy = 1.265 + (((tickAnim - 25) / 6) * (0.37-(1.265)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 0.37 + (((tickAnim - 31) / 2) * (-1.45-(0.37)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -1.45 + (((tickAnim - 33) / 17) * (0-(-1.45)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
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
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNigersaurus entity = (EntityPrehistoricFloraNigersaurus) entitylivingbaseIn;
        int animCycle = 55;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-2.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*4-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*0.5-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = -2.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*4 + (((tickAnim - 22) / 33) * (0-(-2.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*4)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*0.5 + (((tickAnim - 22) / 33) * (0-(1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-20))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));

        this.neckbase.rotationPointX = this.neckbase.rotationPointX + (float)(0);
        this.neckbase.rotationPointY = this.neckbase.rotationPointY - (float)(0);
        this.neckbase.rotationPointZ = this.neckbase.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2.3773+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.09594-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (1.7267+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 2.3773+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 40) / 15) * (0-(2.3773+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = -0.09594 + (((tickAnim - 40) / 15) * (0-(-0.09594)));
            zz = 1.7267+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3 + (((tickAnim - 40) / 15) * (0-(1.7267+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 15) / 25) * (-0.9977-(1)));
            yy = 0 + (((tickAnim - 15) / 25) * (-0.09594-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (1.7267+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -0.9977 + (((tickAnim - 40) / 15) * (0-(-0.9977)));
            yy = -0.09594 + (((tickAnim - 40) / 15) * (0-(-0.09594)));
            zz = 1.7267+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3 + (((tickAnim - 40) / 15) * (0-(1.7267+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));

        this.neckmiddlefront.rotationPointX = this.neckmiddlefront.rotationPointX + (float)(0);
        this.neckmiddlefront.rotationPointY = this.neckmiddlefront.rotationPointY - (float)(0);
        this.neckmiddlefront.rotationPointZ = this.neckmiddlefront.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (-6.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*8-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 55) {
            xx = -6.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*8 + (((tickAnim - 32) / 23) * (0-(-6.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*8)));
            yy = 0 + (((tickAnim - 32) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(xx), neckfront.rotateAngleY + (float) Math.toRadians(yy), neckfront.rotateAngleZ + (float) Math.toRadians(zz));

        this.neckfront.rotationPointX = this.neckfront.rotationPointX + (float)(0);
        this.neckfront.rotationPointY = this.neckfront.rotationPointY - (float)(0);
        this.neckfront.rotationPointZ = this.neckfront.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-20))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 37) {
            xx = -0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-20))*-5 + (((tickAnim - 15) / 22) * (-3.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-8-(-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-20))*-5)));
            yy = 0 + (((tickAnim - 15) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 22) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 55) {
            xx = -3.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-8 + (((tickAnim - 37) / 18) * (0-(-3.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-8)));
            yy = 0 + (((tickAnim - 37) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 26.75 + (((tickAnim - 38) / 15) * (0-(26.75)));
            yy = 0 + (((tickAnim - 38) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawbase, lowerjawbase.rotateAngleX + (float) Math.toRadians(xx), lowerjawbase.rotateAngleY + (float) Math.toRadians(yy), lowerjawbase.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.05-(0)));
            zz = 0 + (((tickAnim - 15) / 23) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 38) / 15) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.05 + (((tickAnim - 38) / 15) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.05)));
            zz = 0 + (((tickAnim - 38) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerjawbase.rotationPointX = this.lowerjawbase.rotationPointX + (float)(xx);
        this.lowerjawbase.rotationPointY = this.lowerjawbase.rotationPointY - (float)(yy);
        this.lowerjawbase.rotationPointZ = this.lowerjawbase.rotationPointZ + (float)(zz);




        if (tickAnim >= 49 && tickAnim < 53) {
            xx = 1 + (((tickAnim - 49) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 49) / 4) * (0.035-(1)));
            zz = 1 + (((tickAnim - 49) / 4) * (1-(1)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 53) / 2) * (1-(1)));
            yy = 0.035 + (((tickAnim - 53) / 2) * (1-(0.035)));
            zz = 1 + (((tickAnim - 53) / 2) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.lefteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 49 && tickAnim < 53) {
            xx = 1 + (((tickAnim - 49) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 49) / 4) * (0.035-(1)));
            zz = 1 + (((tickAnim - 49) / 4) * (1-(1)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 53) / 2) * (1-(1)));
            yy = 0.035 + (((tickAnim - 53) / 2) * (1-(0.035)));
            zz = 1 + (((tickAnim - 53) / 2) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.righteye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNigersaurus entity = (EntityPrehistoricFloraNigersaurus) entitylivingbaseIn;
        int animCycle = 21;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 8.25 + (((tickAnim - 8) / 3) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 8.25 + (((tickAnim - 11) / 11) * (0-(8.25)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 7.25 + (((tickAnim - 8) / 3) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 7.25 + (((tickAnim - 11) / 11) * (0-(7.25)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 19.5 + (((tickAnim - 8) / 3) * (19.5-(19.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 19.5 + (((tickAnim - 11) / 11) * (0-(19.5)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 10 + (((tickAnim - 8) / 3) * (10-(10)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 10 + (((tickAnim - 11) / 11) * (0-(10)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 14 + (((tickAnim - 8) / 3) * (14-(14)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 14 + (((tickAnim - 11) / 11) * (0-(14)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 11 + (((tickAnim - 8) / 3) * (11-(11)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 11 + (((tickAnim - 11) / 11) * (0-(11)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(xx), neckfront.rotateAngleY + (float) Math.toRadians(yy), neckfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -14.5 + (((tickAnim - 8) / 3) * (0-(-14.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 25 + (((tickAnim - 8) / 3) * (0-(25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawbase, lowerjawbase.rotateAngleX + (float) Math.toRadians(xx), lowerjawbase.rotateAngleY + (float) Math.toRadians(yy), lowerjawbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 8) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 2) * (0-(1)));
            zz = 1 + (((tickAnim - 8) / 2) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 10) / 3) * (1-(1)));
            yy = 0 + (((tickAnim - 10) / 3) * (1-(0)));
            zz = 1 + (((tickAnim - 10) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.lefteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 8) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 2) * (0-(1)));
            zz = 1 + (((tickAnim - 8) / 2) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 10) / 3) * (1-(1)));
            yy = 0 + (((tickAnim - 10) / 3) * (1-(0)));
            zz = 1 + (((tickAnim - 10) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.righteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -4.25 + (((tickAnim - 8) / 3) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = -4.25 + (((tickAnim - 11) / 11) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-52.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -52.25 + (((tickAnim - 8) / 3) * (-52.25-(-52.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = -52.25 + (((tickAnim - 11) / 11) * (0-(-52.25)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (41.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 41.25 + (((tickAnim - 8) / 3) * (41.25-(41.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 41.25 + (((tickAnim - 11) / 11) * (0-(41.25)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfrontfoot, rightfrontfoot.rotateAngleX + (float) Math.toRadians(xx), rightfrontfoot.rotateAngleY + (float) Math.toRadians(yy), rightfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -4.25 + (((tickAnim - 8) / 3) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = -4.25 + (((tickAnim - 11) / 11) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-52.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -52.25 + (((tickAnim - 8) / 3) * (-52.25-(-52.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = -52.25 + (((tickAnim - 11) / 11) * (0-(-52.25)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (41.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 41.25 + (((tickAnim - 8) / 3) * (41.25-(41.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 41.25 + (((tickAnim - 11) / 11) * (0-(41.25)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfrontfoot, leftfrontfoot.rotateAngleX + (float) Math.toRadians(xx), leftfrontfoot.rotateAngleY + (float) Math.toRadians(yy), leftfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNigersaurus entity = (EntityPrehistoricFloraNigersaurus) entitylivingbaseIn;
        int animCycle = 155;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = -9 + (((tickAnim - 64) / 51) * (-9-(-9)));
            yy = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 51) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = -9 + (((tickAnim - 115) / 40) * (0-(-9)));
            yy = 0 + (((tickAnim - 115) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (4.25-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            yy = -5 + (((tickAnim - 64) / 51) * (-5-(-5)));
            zz = 4.25 + (((tickAnim - 64) / 51) * (4.25-(4.25)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 115) / 40) * (0-(0)));
            yy = -5 + (((tickAnim - 115) / 40) * (0-(-5)));
            zz = 4.25 + (((tickAnim - 115) / 40) * (0-(4.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = 1.25 + (((tickAnim - 64) / 51) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 51) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 1.25 + (((tickAnim - 115) / 40) * (0-(1.25)));
            yy = 0 + (((tickAnim - 115) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 0) / 155) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 155) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 155) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-1.265+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 64) {
            xx = -1.265+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5 + (((tickAnim - 35) / 29) * (-6-(-1.265+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5)));
            yy = 0 + (((tickAnim - 35) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90/0.75))*3-(0)));
            zz = 0 + (((tickAnim - 35) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*1.5-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = -6 + (((tickAnim - 64) / 51) * (-6-(-6)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90/0.75))*3 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90/0.75))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90/0.75))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*1.5 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*1.5)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = -6 + (((tickAnim - 115) / 40) * (0-(-6)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90/0.75))*3 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90/0.75))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*1.5 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-6.82+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 64) {
            xx = -6.82+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*10 + (((tickAnim - 35) / 29) * (-11-(-6.82+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*10)));
            yy = 0 + (((tickAnim - 35) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90/0.75+50))*2-(0)));
            zz = 0 + (((tickAnim - 35) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-120))*2-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = -11 + (((tickAnim - 64) / 51) * (-11-(-11)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90/0.75+50))*2 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90/0.75+50))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90/0.75+50))*2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-120))*2 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-120))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-120))*2)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = -11 + (((tickAnim - 115) / 40) * (0-(-11)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90/0.75+50))*2 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90/0.75+50))*2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-120))*2 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-120))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (12.38-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 64) {
            xx = 12.38 + (((tickAnim - 35) / 29) * (-11-(12.38)));
            yy = 0 + (((tickAnim - 35) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-200))*2.5-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = -11 + (((tickAnim - 64) / 51) * (-11-(-11)));
            yy = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-200))*2.5 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-200))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-200))*2.5)));
        }
        else if (tickAnim >= 115 && tickAnim < 142) {
            xx = -11 + (((tickAnim - 115) / 27) * (0.75-(-11)));
            yy = 0 + (((tickAnim - 115) / 27) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-200))*2.5 + (((tickAnim - 115) / 27) * (0.98052-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-200))*2.5)));
        }
        else if (tickAnim >= 142 && tickAnim < 155) {
            xx = 0.75 + (((tickAnim - 142) / 13) * (0-(0.75)));
            yy = 0 + (((tickAnim - 142) / 13) * (0-(0)));
            zz = 0.98052 + (((tickAnim - 142) / 13) * (0-(0.98052)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (1.71+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 1.71+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5 + (((tickAnim - 19) / 16) * (-6.46-(1.71+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 64) {
            xx = -6.46 + (((tickAnim - 35) / 29) * (-10.25-(-6.46)));
            yy = 0 + (((tickAnim - 35) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-250))*3-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = -10.25 + (((tickAnim - 64) / 51) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-250))*3 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-250))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-250))*3)));
        }
        else if (tickAnim >= 115 && tickAnim < 142) {
            xx = -10.25 + (((tickAnim - 115) / 27) * (-4.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*-10-(-10.25)));
            yy = 0 + (((tickAnim - 115) / 27) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-250))*3 + (((tickAnim - 115) / 27) * (1.46901-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-250))*3)));
        }
        else if (tickAnim >= 142 && tickAnim < 155) {
            xx = -4.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*-10 + (((tickAnim - 142) / 13) * (0-(-4.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*-10)));
            yy = 0 + (((tickAnim - 142) / 13) * (0-(0)));
            zz = 1.46901 + (((tickAnim - 142) / 13) * (0-(1.46901)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(xx), neckfront.rotateAngleY + (float) Math.toRadians(yy), neckfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 0) / 155) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 155) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 155) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 0) / 155) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 155) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 155) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = -5.75 + (((tickAnim - 64) / 51) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 51) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = -5.75 + (((tickAnim - 115) / 40) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 115) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = 13.75 + (((tickAnim - 64) / 51) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 51) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 13.75 + (((tickAnim - 115) / 40) * (0-(13.75)));
            yy = 0 + (((tickAnim - 115) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfrontfoot, rightfrontfoot.rotateAngleX + (float) Math.toRadians(xx), rightfrontfoot.rotateAngleY + (float) Math.toRadians(yy), rightfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 0) / 155) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 155) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 155) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = -5.75 + (((tickAnim - 64) / 51) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 51) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = -5.75 + (((tickAnim - 115) / 40) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 115) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = 13.75 + (((tickAnim - 64) / 51) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 51) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 13.75 + (((tickAnim - 115) / 40) * (0-(13.75)));
            yy = 0 + (((tickAnim - 115) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfrontfoot, leftfrontfoot.rotateAngleX + (float) Math.toRadians(xx), leftfrontfoot.rotateAngleY + (float) Math.toRadians(yy), leftfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (4.98-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 64) {
            xx = 4.98 + (((tickAnim - 30) / 34) * (9.75-(4.98)));
            yy = 0 + (((tickAnim - 30) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*0.5-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = 9.75 + (((tickAnim - 64) / 51) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*0.5 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*0.5)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 9.75 + (((tickAnim - 115) / 40) * (0-(9.75)));
            yy = 0 + (((tickAnim - 115) / 40) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*0.5 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (6.57-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 64) {
            xx = 6.57 + (((tickAnim - 30) / 34) * (13.75-(6.57)));
            yy = 0 + (((tickAnim - 30) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*1-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = 13.75 + (((tickAnim - 64) / 51) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*1 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*1)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 13.75 + (((tickAnim - 115) / 40) * (0-(13.75)));
            yy = 0 + (((tickAnim - 115) / 40) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*1 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (7.83-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 64) {
            xx = 7.83 + (((tickAnim - 30) / 34) * (16.5-(7.83)));
            yy = 0 + (((tickAnim - 30) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-100))*3-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = 16.5 + (((tickAnim - 64) / 51) * (16.5-(16.5)));
            yy = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-100))*3 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-100))*3)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 16.5 + (((tickAnim - 115) / 40) * (0-(16.5)));
            yy = 0 + (((tickAnim - 115) / 40) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*3 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (7.77-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 64) {
            xx = 7.77 + (((tickAnim - 30) / 34) * (18-(7.77)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5 + (((tickAnim - 30) / 34) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5)));
            zz = 0 + (((tickAnim - 30) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-150))*3-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = 18 + (((tickAnim - 64) / 51) * (18-(18)));
            yy = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-150))*3 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-150))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-150))*3)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 18 + (((tickAnim - 115) / 40) * (0-(18)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-150))*3 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-150))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (6.17-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*8-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 64) {
            xx = 6.17 + (((tickAnim - 30) / 34) * (11.25-(6.17)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*8 + (((tickAnim - 30) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*8)));
            zz = 0 + (((tickAnim - 30) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-200))*8-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = 11.25 + (((tickAnim - 64) / 51) * (11.25-(11.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*8 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*8)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-200))*8 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-200))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-200))*8)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 11.25 + (((tickAnim - 115) / 40) * (0-(11.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*8 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*8)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-200))*8 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-200))*8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-2.58-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 64) {
            xx = -2.58 + (((tickAnim - 30) / 34) * (-0.75-(-2.58)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*10 + (((tickAnim - 30) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*10)));
            zz = 0 + (((tickAnim - 30) / 34) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-250))*12-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = -0.75 + (((tickAnim - 64) / 51) * (11.25-(-0.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*10 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-250))*12 + (((tickAnim - 64) / 51) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-300))*16-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-250))*12)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 11.25 + (((tickAnim - 115) / 40) * (0-(11.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*10 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-300))*16 + (((tickAnim - 115) / 40) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-300))*16)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-7.51-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*15-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 64) {
            xx = -7.51 + (((tickAnim - 30) / 34) * (-0.75-(-7.51)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*15 + (((tickAnim - 30) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*15)));
            zz = 0 + (((tickAnim - 30) / 34) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-300))*16-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = -0.75 + (((tickAnim - 64) / 51) * (11.25-(-0.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*15 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-300))*16 + (((tickAnim - 64) / 51) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-300))*16-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-300))*16)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 11.25 + (((tickAnim - 115) / 40) * (0-(11.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*15 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-300))*16 + (((tickAnim - 115) / 40) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-300))*16)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-10.12-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*20-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 64) {
            xx = -10.12 + (((tickAnim - 30) / 34) * (-0.75-(-10.12)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*20 + (((tickAnim - 30) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*20)));
            zz = 0 + (((tickAnim - 30) / 34) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-350))*20-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = -0.75 + (((tickAnim - 64) / 51) * (11.25-(-0.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*20 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*20)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-350))*20 + (((tickAnim - 64) / 51) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-350))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-350))*20)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 11.25 + (((tickAnim - 115) / 40) * (0-(11.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*20 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*20)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-350))*20 + (((tickAnim - 115) / 40) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-350))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*25-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 64) {
            xx = -17.75 + (((tickAnim - 30) / 34) * (-0.75-(-17.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*25 + (((tickAnim - 30) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*25)));
            zz = 0 + (((tickAnim - 30) / 34) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-400))*24-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = -0.75 + (((tickAnim - 64) / 51) * (11.25-(-0.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*25 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-400))*24 + (((tickAnim - 64) / 51) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-400))*24-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-400))*24)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 11.25 + (((tickAnim - 115) / 40) * (0-(11.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*20 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*20)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-400))*24 + (((tickAnim - 115) / 40) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-400))*24)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(xx), tail9.rotateAngleY + (float) Math.toRadians(yy), tail9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = -10 + (((tickAnim - 64) / 51) * (-10-(-10)));
            yy = 5.75 + (((tickAnim - 64) / 51) * (5.75-(5.75)));
            zz = 0 + (((tickAnim - 64) / 51) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = -10 + (((tickAnim - 115) / 40) * (0-(-10)));
            yy = 5.75 + (((tickAnim - 115) / 40) * (0-(5.75)));
            zz = 0 + (((tickAnim - 115) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = 29 + (((tickAnim - 64) / 51) * (29-(29)));
            yy = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 51) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 29 + (((tickAnim - 115) / 40) * (0-(29)));
            yy = 0 + (((tickAnim - 115) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = -9.25 + (((tickAnim - 64) / 51) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 51) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = -9.25 + (((tickAnim - 115) / 40) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 115) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthindfoot, righthindfoot.rotateAngleX + (float) Math.toRadians(xx), righthindfoot.rotateAngleY + (float) Math.toRadians(yy), righthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            yy = 1.1 + (((tickAnim - 64) / 51) * (1.1-(1.1)));
            zz = 0 + (((tickAnim - 64) / 51) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 115) / 40) * (0-(0)));
            yy = 1.1 + (((tickAnim - 115) / 40) * (0-(1.1)));
            zz = 0 + (((tickAnim - 115) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthindfoot.rotationPointX = this.righthindfoot.rotationPointX + (float)(xx);
        this.righthindfoot.rotationPointY = this.righthindfoot.rotationPointY - (float)(yy);
        this.righthindfoot.rotationPointZ = this.righthindfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (-5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = -10 + (((tickAnim - 64) / 51) * (-10-(-10)));
            yy = -5.75 + (((tickAnim - 64) / 51) * (-5.75-(-5.75)));
            zz = 0 + (((tickAnim - 64) / 51) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = -10 + (((tickAnim - 115) / 40) * (0-(-10)));
            yy = -5.75 + (((tickAnim - 115) / 40) * (0-(-5.75)));
            zz = 0 + (((tickAnim - 115) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = 29 + (((tickAnim - 64) / 51) * (29-(29)));
            yy = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 51) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 29 + (((tickAnim - 115) / 40) * (0-(29)));
            yy = 0 + (((tickAnim - 115) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = -9.25 + (((tickAnim - 64) / 51) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 51) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = -9.25 + (((tickAnim - 115) / 40) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 115) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthindfoot, lefthindfoot.rotateAngleX + (float) Math.toRadians(xx), lefthindfoot.rotateAngleY + (float) Math.toRadians(yy), lefthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            yy = 1.1 + (((tickAnim - 64) / 51) * (1.1-(1.1)));
            zz = 0 + (((tickAnim - 64) / 51) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 115) / 40) * (0-(0)));
            yy = 1.1 + (((tickAnim - 115) / 40) * (0-(1.1)));
            zz = 0 + (((tickAnim - 115) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthindfoot.rotationPointX = this.lefthindfoot.rotationPointX + (float)(xx);
        this.lefthindfoot.rotationPointY = this.lefthindfoot.rotationPointY - (float)(yy);
        this.lefthindfoot.rotationPointZ = this.lefthindfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 35) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3+120))*3-(0)));
            zz = 0 + (((tickAnim - 35) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-100))*4-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3+120))*3 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3+120))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3+120))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-100))*4 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-100))*4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-100))*4)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 115) / 40) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3+120))*3 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3+120))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-100))*4 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-100))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckflapfront, neckflapfront.rotateAngleX + (float) Math.toRadians(xx), neckflapfront.rotateAngleY + (float) Math.toRadians(yy), neckflapfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 35) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3+160))*1-(0)));
            zz = 0 + (((tickAnim - 35) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*4-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3+160))*1 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3+160))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3+160))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*4 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*4)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 115) / 40) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3+160))*1 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3+160))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*4 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckflapmidfront, neckflapmidfront.rotateAngleX + (float) Math.toRadians(xx), neckflapmidfront.rotateAngleY + (float) Math.toRadians(yy), neckflapmidfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 35) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*1.5-(0)));
            zz = 0 + (((tickAnim - 35) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*4-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 64) / 51) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*1.5 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*1.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*4 + (((tickAnim - 64) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*4)));
        }
        else if (tickAnim >= 115 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 115) / 40) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*1.5 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*1.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*4 + (((tickAnim - 115) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-50))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckflapmidbase, neckflapmidbase.rotateAngleX + (float) Math.toRadians(xx), neckflapmidbase.rotateAngleY + (float) Math.toRadians(yy), neckflapmidbase.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNigersaurus entity = (EntityPrehistoricFloraNigersaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -9.25 + (((tickAnim - 20) / 12) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -9.25 + (((tickAnim - 32) / 18) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-7.325-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = -7.325 + (((tickAnim - 20) / 12) * (-7.325-(-7.325)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = -7.325 + (((tickAnim - 32) / 18) * (0-(-7.325)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 7.75 + (((tickAnim - 20) / 12) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 7.75 + (((tickAnim - 32) / 18) * (0-(7.75)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 6.25 + (((tickAnim - 20) / 12) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 6.25 + (((tickAnim - 32) / 18) * (0-(6.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 10.75 + (((tickAnim - 20) / 12) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 32) / 18) * (0-(10.75)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.8-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = 1.8 + (((tickAnim - 20) / 12) * (1.8-(1.8)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 1.8 + (((tickAnim - 32) / 18) * (0-(1.8)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightlowerarm.rotationPointX = this.rightlowerarm.rotationPointX + (float)(xx);
        this.rightlowerarm.rotationPointY = this.rightlowerarm.rotationPointY - (float)(yy);
        this.rightlowerarm.rotationPointZ = this.rightlowerarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 10.75 + (((tickAnim - 20) / 12) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 32) / 18) * (0-(10.75)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.8-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = 1.8 + (((tickAnim - 20) / 12) * (1.8-(1.8)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 1.8 + (((tickAnim - 32) / 18) * (0-(1.8)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftlowerarm.rotationPointX = this.leftlowerarm.rotationPointX + (float)(xx);
        this.leftlowerarm.rotationPointY = this.leftlowerarm.rotationPointY - (float)(yy);
        this.leftlowerarm.rotationPointZ = this.leftlowerarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 2.75 + (((tickAnim - 20) / 12) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 2.75 + (((tickAnim - 32) / 18) * (0-(2.75)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 7.5 + (((tickAnim - 20) / 12) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 32) / 18) * (0-(7.5)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 3.25 + (((tickAnim - 20) / 12) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 3.25 + (((tickAnim - 32) / 18) * (0-(3.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 2.25 + (((tickAnim - 20) / 12) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 2.25 + (((tickAnim - 32) / 18) * (0-(2.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -3 + (((tickAnim - 20) / 12) * (-3-(-3)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -3 + (((tickAnim - 32) / 18) * (0-(-3)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -8.5 + (((tickAnim - 20) / 12) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 32) / 18) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -3 + (((tickAnim - 20) / 12) * (-3-(-3)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -3 + (((tickAnim - 32) / 18) * (0-(-3)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.55303-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (12.3799-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (7.0581-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -6.55303 + (((tickAnim - 20) / 12) * (-6.55303-(-6.55303)));
            yy = 12.3799 + (((tickAnim - 20) / 12) * (12.3799-(12.3799)));
            zz = 7.0581 + (((tickAnim - 20) / 12) * (7.0581-(7.0581)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -6.55303 + (((tickAnim - 32) / 18) * (0-(-6.55303)));
            yy = 12.3799 + (((tickAnim - 32) / 18) * (0-(12.3799)));
            zz = 7.0581 + (((tickAnim - 32) / 18) * (0-(7.0581)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (42.42811-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.5722-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-6.0145-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 42.42811 + (((tickAnim - 20) / 12) * (42.42811-(42.42811)));
            yy = 2.5722 + (((tickAnim - 20) / 12) * (2.5722-(2.5722)));
            zz = -6.0145 + (((tickAnim - 20) / 12) * (-6.0145-(-6.0145)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 42.42811 + (((tickAnim - 32) / 18) * (0-(42.42811)));
            yy = 2.5722 + (((tickAnim - 32) / 18) * (0-(2.5722)));
            zz = -6.0145 + (((tickAnim - 32) / 18) * (0-(-6.0145)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-23.48265-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.49198-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.33206-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -23.48265 + (((tickAnim - 20) / 12) * (-23.48265-(-23.48265)));
            yy = -1.49198 + (((tickAnim - 20) / 12) * (-1.49198-(-1.49198)));
            zz = -1.33206 + (((tickAnim - 20) / 12) * (-1.33206-(-1.33206)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -23.48265 + (((tickAnim - 32) / 18) * (0-(-23.48265)));
            yy = -1.49198 + (((tickAnim - 32) / 18) * (0-(-1.49198)));
            zz = -1.33206 + (((tickAnim - 32) / 18) * (0-(-1.33206)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthindfoot, righthindfoot.rotateAngleX + (float) Math.toRadians(xx), righthindfoot.rotateAngleY + (float) Math.toRadians(yy), righthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = 0.75 + (((tickAnim - 20) / 12) * (0.75-(0.75)));
            zz = 0.2 + (((tickAnim - 20) / 12) * (0.2-(0.2)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 0.75 + (((tickAnim - 32) / 18) * (0-(0.75)));
            zz = 0.2 + (((tickAnim - 32) / 18) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthindfoot.rotationPointX = this.righthindfoot.rotationPointX + (float)(xx);
        this.righthindfoot.rotationPointY = this.righthindfoot.rotationPointY - (float)(yy);
        this.righthindfoot.rotationPointZ = this.righthindfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.55303-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-12.37985-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-7.05806-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -6.55303 + (((tickAnim - 20) / 12) * (-6.55303-(-6.55303)));
            yy = -12.37985 + (((tickAnim - 20) / 12) * (-12.37985-(-12.37985)));
            zz = -7.05806 + (((tickAnim - 20) / 12) * (-7.05806-(-7.05806)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -6.55303 + (((tickAnim - 32) / 18) * (0-(-6.55303)));
            yy = -12.37985 + (((tickAnim - 32) / 18) * (0-(-12.37985)));
            zz = -7.05806 + (((tickAnim - 32) / 18) * (0-(-7.05806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (42.42811-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.57216-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (6.01451-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 42.42811 + (((tickAnim - 20) / 12) * (42.42811-(42.42811)));
            yy = -2.57216 + (((tickAnim - 20) / 12) * (-2.57216-(-2.57216)));
            zz = 6.01451 + (((tickAnim - 20) / 12) * (6.01451-(6.01451)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 42.42811 + (((tickAnim - 32) / 18) * (0-(42.42811)));
            yy = -2.57216 + (((tickAnim - 32) / 18) * (0-(-2.57216)));
            zz = 6.01451 + (((tickAnim - 32) / 18) * (0-(6.01451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-23.48265-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.49198-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.33206-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -23.48265 + (((tickAnim - 20) / 12) * (-23.48265-(-23.48265)));
            yy = -1.49198 + (((tickAnim - 20) / 12) * (-1.49198-(-1.49198)));
            zz = -1.33206 + (((tickAnim - 20) / 12) * (-1.33206-(-1.33206)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -23.48265 + (((tickAnim - 32) / 18) * (0-(-23.48265)));
            yy = -1.49198 + (((tickAnim - 32) / 18) * (0-(-1.49198)));
            zz = -1.33206 + (((tickAnim - 32) / 18) * (0-(-1.33206)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthindfoot, lefthindfoot.rotateAngleX + (float) Math.toRadians(xx), lefthindfoot.rotateAngleY + (float) Math.toRadians(yy), lefthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = 0.75 + (((tickAnim - 20) / 12) * (0.75-(0.75)));
            zz = 0.2 + (((tickAnim - 20) / 12) * (0.2-(0.2)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 0.75 + (((tickAnim - 32) / 18) * (0-(0.75)));
            zz = 0.2 + (((tickAnim - 32) / 18) * (0-(0.2)));
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
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraNigersaurus entity = (EntityPrehistoricFloraNigersaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-30))*1), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455+20))*3), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-20))*3));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1 + (((tickAnim - 0) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1)));
            zz = -0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1 + (((tickAnim - 0) / 6) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.8-(-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1 + (((tickAnim - 6) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1)));
            zz = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.8 + (((tickAnim - 6) / 5) * (0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.8)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1 + (((tickAnim - 11) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1)));
            zz = 0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1 + (((tickAnim - 11) / 5) * (0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1-(0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(0.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-10))*-2.3), bodymiddle.rotateAngleY + (float) Math.toRadians(0), bodymiddle.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-30))*-5));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.05 + (((tickAnim - 3) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.05)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.05-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.05 + (((tickAnim - 13) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.05)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.bodymiddle.rotationPointX = this.bodymiddle.rotationPointX + (float)(xx);
        this.bodymiddle.rotationPointY = this.bodymiddle.rotationPointY - (float)(yy);
        this.bodymiddle.rotationPointZ = this.bodymiddle.rotationPointZ + (float)(zz);



        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5+30))*3.5), bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-20))*-2), bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-50))*5));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.07-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.07 + (((tickAnim - 3) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.07)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.07-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.07 + (((tickAnim - 13) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.07)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.bodyfront.rotationPointX = this.bodyfront.rotationPointX + (float)(xx);
        this.bodyfront.rotationPointY = this.bodyfront.rotationPointY - (float)(yy);
        this.bodyfront.rotationPointZ = this.bodyfront.rotationPointZ + (float)(zz);



        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(0.5806+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-50))*1.5), neckbase.rotateAngleY + (float) Math.toRadians(-1.66161), neckbase.rotateAngleZ + (float) Math.toRadians(-0.934+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-30))*-2.8));


        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(-7.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-70))*1), neckmiddlebase.rotateAngleY + (float) Math.toRadians(0), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-80))*2));


        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5+100))*-1), neckmiddlefront.rotateAngleY + (float) Math.toRadians(0), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-120))*2));


        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(9.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5+30))*-2), neckfront.rotateAngleY + (float) Math.toRadians(0), neckfront.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -16.75 + (((tickAnim - 0) / 8) * (18.5-(-16.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 18.5 + (((tickAnim - 8) / 5) * (-4.57353-(18.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (1.04246-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (7.17506-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -4.57353 + (((tickAnim - 13) / 3) * (-16.75-(-4.57353)));
            yy = 1.04246 + (((tickAnim - 13) / 3) * (0-(1.04246)));
            zz = 7.17506 + (((tickAnim - 13) / 3) * (0-(7.17506)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -2.25 + (((tickAnim - 0) / 8) * (4.5-(-2.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 4.5 + (((tickAnim - 8) / 5) * (-32.18613-(4.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (-0.18388-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-8.31618-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -32.18613 + (((tickAnim - 13) / 3) * (-2.25-(-32.18613)));
            yy = -0.18388 + (((tickAnim - 13) / 3) * (0-(-0.18388)));
            zz = -8.31618 + (((tickAnim - 13) / 3) * (0-(-8.31618)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 2) * (-1.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*0.6-(-0.425)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = -1.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*0.6 + (((tickAnim - 2) / 2) * (-0.425-(-1.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*0.6)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.425 + (((tickAnim - 4) / 4) * (-1.275-(-0.425)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -1.275 + (((tickAnim - 8) / 5) * (0.77-(-1.275)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.77 + (((tickAnim - 13) / 3) * (-0.425-(0.77)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightlowerarm.rotationPointX = this.rightlowerarm.rotationPointX + (float)(xx);
        this.rightlowerarm.rotationPointY = this.rightlowerarm.rotationPointY - (float)(yy);
        this.rightlowerarm.rotationPointZ = this.rightlowerarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 20.25 + (((tickAnim - 0) / 8) * (8-(20.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 8 + (((tickAnim - 8) / 5) * (54.75-(8)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 54.75 + (((tickAnim - 13) / 1) * (9-(54.75)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 9 + (((tickAnim - 14) / 2) * (20.25-(9)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfrontfoot, rightfrontfoot.rotateAngleX + (float) Math.toRadians(xx), rightfrontfoot.rotateAngleY + (float) Math.toRadians(yy), rightfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.725 + (((tickAnim - 0) / 8) * (-1.15-(-0.725)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -1.15 + (((tickAnim - 8) / 5) * (0.105-(-1.15)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.105 + (((tickAnim - 13) / 3) * (-0.725-(0.105)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfrontfoot.rotationPointX = this.rightfrontfoot.rotationPointX + (float)(xx);
        this.rightfrontfoot.rotationPointY = this.rightfrontfoot.rotationPointY - (float)(yy);
        this.rightfrontfoot.rotationPointZ = this.rightfrontfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20.25 + (((tickAnim - 0) / 3) * (-4.34411-(20.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.86344-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-5.93777-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -4.34411 + (((tickAnim - 3) / 5) * (-20.25-(-4.34411)));
            yy = -0.86344 + (((tickAnim - 3) / 5) * (0-(-0.86344)));
            zz = -5.93777 + (((tickAnim - 3) / 5) * (0-(-5.93777)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -20.25 + (((tickAnim - 8) / 8) * (20.25-(-20.25)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 7 + (((tickAnim - 0) / 4) * (-25.18178-(7)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.05122-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (7.42638-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -25.18178 + (((tickAnim - 4) / 4) * (2.25-(-25.18178)));
            yy = 1.05122 + (((tickAnim - 4) / 4) * (0-(1.05122)));
            zz = 7.42638 + (((tickAnim - 4) / 4) * (0-(7.42638)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 2.25 + (((tickAnim - 8) / 8) * (7-(2.25)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -1.45 + (((tickAnim - 0) / 4) * (0.495-(-1.45)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.495 + (((tickAnim - 4) / 4) * (-0.85-(0.495)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.85 + (((tickAnim - 8) / 1) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*0.6-(-0.85)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*0.6 + (((tickAnim - 9) / 3) * (-0.425-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*0.6)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = -0.425 + (((tickAnim - 12) / 4) * (-1.45-(-0.425)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
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
            xx = 8 + (((tickAnim - 0) / 3) * (50.25-(8)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 50.25 + (((tickAnim - 3) / 3) * (12-(50.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 12 + (((tickAnim - 6) / 2) * (19.75-(12)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 19.75 + (((tickAnim - 8) / 4) * (5.5-(19.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 5.5 + (((tickAnim - 12) / 4) * (8-(5.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfrontfoot, leftfrontfoot.rotateAngleX + (float) Math.toRadians(xx), leftfrontfoot.rotateAngleY + (float) Math.toRadians(yy), leftfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1.15 + (((tickAnim - 0) / 3) * (0.005-(-1.15)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.005 + (((tickAnim - 3) / 5) * (-0.6-(0.005)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = -0.6 + (((tickAnim - 8) / 8) * (-1.15-(-0.6)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfrontfoot.rotationPointX = this.leftfrontfoot.rotationPointX + (float)(xx);
        this.leftfrontfoot.rotationPointY = this.leftfrontfoot.rotationPointY - (float)(yy);
        this.leftfrontfoot.rotationPointZ = this.leftfrontfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-20))*0.2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-30))*5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-50))*0.4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-60))*5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455+30))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-50))*0.7), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-120))*7), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455+60))));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-50))*-1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-100))*9), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455+60))*5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-70))*2), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-190))*11), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455+60))*5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-90))*3), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-200))*14), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455+60))*8));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-100))*5), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-220))*18), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455+60))*8));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-120))*10), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-250))*25), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455+60))*8));


        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-120))*10), tail9.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455-250))*25), tail9.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455+60))*8));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 9.25 + (((tickAnim - 0) / 3) * (14.75-(9.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 14.75 + (((tickAnim - 3) / 5) * (-8.13729-(14.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (4.23702-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-0.33221-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -8.13729 + (((tickAnim - 8) / 1) * (-15.75-(-8.13729)));
            yy = 4.23702 + (((tickAnim - 8) / 1) * (0-(4.23702)));
            zz = -0.33221 + (((tickAnim - 8) / 1) * (0-(-0.33221)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -15.75 + (((tickAnim - 9) / 7) * (9.25-(-15.75)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.75 + (((tickAnim - 0) / 3) * (21.5-(1.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 21.5 + (((tickAnim - 3) / 3) * (10.62-(21.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 10.62 + (((tickAnim - 6) / 2) * (-3.31-(10.62)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -3.31 + (((tickAnim - 8) / 1) * (4.75-(-3.31)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 4.75 + (((tickAnim - 9) / 7) * (1.75-(4.75)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (4.7-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 4.7 + (((tickAnim - 6) / 3) * (-0.7-(4.7)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = -0.7 + (((tickAnim - 9) / 3) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*-0.5-(-0.7)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*-0.5 + (((tickAnim - 12) / 2) * (0.025-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.9))*-0.5)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0.025 + (((tickAnim - 14) / 2) * (0-(0.025)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightshin.rotationPointX = this.rightshin.rotationPointX + (float)(xx);
        this.rightshin.rotationPointY = this.rightshin.rotationPointY - (float)(yy);
        this.rightshin.rotationPointZ = this.rightshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.25 + (((tickAnim - 0) / 3) * (36.5-(4.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 36.5 + (((tickAnim - 3) / 3) * (0-(36.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (11.25-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 11.25 + (((tickAnim - 9) / 4) * (-1.13-(11.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -1.13 + (((tickAnim - 13) / 3) * (4.25-(-1.13)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthindfoot, righthindfoot.rotateAngleX + (float) Math.toRadians(xx), righthindfoot.rotateAngleY + (float) Math.toRadians(yy), righthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 3) * (-0.4-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.4 + (((tickAnim - 3) / 3) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (-1.275-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -1.275 + (((tickAnim - 9) / 4) * (-0.095-(-1.275)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -0.095 + (((tickAnim - 13) / 3) * (-0.4-(-0.095)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthindfoot.rotationPointX = this.righthindfoot.rotationPointX + (float)(xx);
        this.righthindfoot.rotationPointY = this.righthindfoot.rotationPointY - (float)(yy);
        this.righthindfoot.rotationPointZ = this.righthindfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -16 + (((tickAnim - 0) / 9) * (10.98-(-16)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 10.98 + (((tickAnim - 9) / 5) * (-9.27627-(10.98)));
            yy = 0 + (((tickAnim - 9) / 5) * (-4.97603-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0.48958-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -9.27627 + (((tickAnim - 14) / 2) * (-16-(-9.27627)));
            yy = -4.97603 + (((tickAnim - 14) / 2) * (0-(-4.97603)));
            zz = 0.48958 + (((tickAnim - 14) / 2) * (0-(0.48958)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 4.75 + (((tickAnim - 0) / 9) * (21.5-(4.75)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 21.5 + (((tickAnim - 9) / 3) * (31.87-(21.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 31.87 + (((tickAnim - 12) / 2) * (-0.61-(31.87)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -0.61 + (((tickAnim - 14) / 2) * (4.75-(-0.61)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.775 + (((tickAnim - 0) / 3) * (-0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.65))*-0.5-(-0.775)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.65))*-0.5 + (((tickAnim - 3) / 2) * (0.025-(-0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.65))*-0.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0.025 + (((tickAnim - 5) / 4) * (0-(0.025)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (1.825-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 1.825 + (((tickAnim - 12) / 2) * (2.82-(1.825)));
            zz = 0 + (((tickAnim - 12) / 2) * (-0.875-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 2.82 + (((tickAnim - 14) / 2) * (-0.7-(2.82)));
            zz = -0.875 + (((tickAnim - 14) / 2) * (0-(-0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftshin.rotationPointX = this.leftshin.rotationPointX + (float)(xx);
        this.leftshin.rotationPointY = this.leftshin.rotationPointY - (float)(yy);
        this.leftshin.rotationPointZ = this.leftshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.25 + (((tickAnim - 0) / 5) * (-8.79-(12.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -8.79 + (((tickAnim - 5) / 4) * (36.5-(-8.79)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 36.5 + (((tickAnim - 9) / 4) * (37-(36.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 37 + (((tickAnim - 13) / 1) * (0-(37)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (12.25-(0)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthindfoot, lefthindfoot.rotateAngleX + (float) Math.toRadians(xx), lefthindfoot.rotateAngleY + (float) Math.toRadians(yy), lefthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = -1.475 + (((tickAnim - 0) / 9) * (-0.4-(-1.475)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.4 + (((tickAnim - 9) / 4) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 2) * (-1.475-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthindfoot.rotationPointX = this.lefthindfoot.rotationPointX + (float)(xx);
        this.lefthindfoot.rotationPointY = this.lefthindfoot.rotationPointY - (float)(yy);
        this.lefthindfoot.rotationPointZ = this.lefthindfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(5.75), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraNigersaurus entity = (EntityPrehistoricFloraNigersaurus) entitylivingbaseIn;
        int animCycle = 26;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 9.25 + (((tickAnim - 0) / 7) * (20-(9.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 20 + (((tickAnim - 7) / 4) * (0.3811-(20)));
            yy = 0 + (((tickAnim - 7) / 4) * (0.19983-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (3.4943-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0.3811 + (((tickAnim - 11) / 4) * (-15.75-(0.3811)));
            yy = 0.19983 + (((tickAnim - 11) / 4) * (0-(0.19983)));
            zz = 3.4943 + (((tickAnim - 11) / 4) * (0-(3.4943)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = -15.75 + (((tickAnim - 15) / 12) * (9.25-(-15.75)));
            yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -2 + (((tickAnim - 0) / 7) * (5.75-(-2)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 5.75 + (((tickAnim - 7) / 4) * (-33.45223-(5.75)));
            yy = 0 + (((tickAnim - 7) / 4) * (-3.9876-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (-4.81653-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -33.45223 + (((tickAnim - 11) / 4) * (-2-(-33.45223)));
            yy = -3.9876 + (((tickAnim - 11) / 4) * (0-(-3.9876)));
            zz = -4.81653 + (((tickAnim - 11) / 4) * (0-(-4.81653)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = -2 + (((tickAnim - 15) / 12) * (-2-(-2)));
            yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 7) * (-1.645-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = -1.645 + (((tickAnim - 7) / 4) * (0.255-(-1.645)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.255 + (((tickAnim - 11) / 4) * (0-(0.255)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 12) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightlowerarm.rotationPointX = this.rightlowerarm.rotationPointX + (float)(xx);
        this.rightlowerarm.rotationPointY = this.rightlowerarm.rotationPointY - (float)(yy);
        this.rightlowerarm.rotationPointZ = this.rightlowerarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 13 + (((tickAnim - 7) / 4) * (32-(13)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 32 + (((tickAnim - 11) / 2) * (0-(32)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (18-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 18 + (((tickAnim - 15) / 12) * (0-(18)));
            yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfrontfoot, rightfrontfoot.rotateAngleX + (float) Math.toRadians(xx), rightfrontfoot.rotateAngleY + (float) Math.toRadians(yy), rightfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 7) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (-0.975-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            yy = -0.975 + (((tickAnim - 15) / 12) * (-0.4-(-0.975)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfrontfoot.rotationPointX = this.rightfrontfoot.rotationPointX + (float)(xx);
        this.rightfrontfoot.rotationPointY = this.rightfrontfoot.rotationPointY - (float)(yy);
        this.rightfrontfoot.rotationPointZ = this.rightfrontfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -15.75 + (((tickAnim - 0) / 18) * (9.25-(-15.75)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 9.25 + (((tickAnim - 18) / 5) * (-3.22893-(9.25)));
            yy = 0 + (((tickAnim - 18) / 5) * (-0.54007-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-4.46754-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -3.22893 + (((tickAnim - 23) / 4) * (-15.75-(-3.22893)));
            yy = -0.54007 + (((tickAnim - 23) / 4) * (0-(-0.54007)));
            zz = -4.46754 + (((tickAnim - 23) / 4) * (0-(-4.46754)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -2 + (((tickAnim - 0) / 18) * (-2-(-2)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -2 + (((tickAnim - 18) / 5) * (-34.95236-(-2)));
            yy = 0 + (((tickAnim - 18) / 5) * (2.71671-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (2.2249-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -34.95236 + (((tickAnim - 23) / 4) * (-2-(-34.95236)));
            yy = 2.71671 + (((tickAnim - 23) / 4) * (0-(2.71671)));
            zz = 2.2249 + (((tickAnim - 23) / 4) * (0-(2.2249)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -0.175 + (((tickAnim - 18) / 5) * (0.36-(-0.175)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0.36 + (((tickAnim - 23) / 4) * (0-(0.36)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftlowerarm.rotationPointX = this.leftlowerarm.rotationPointX + (float)(xx);
        this.leftlowerarm.rotationPointY = this.leftlowerarm.rotationPointY - (float)(yy);
        this.leftlowerarm.rotationPointZ = this.leftlowerarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 18 + (((tickAnim - 0) / 18) * (23.75-(18)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 23.75 + (((tickAnim - 18) / 5) * (46.13-(23.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 46.13 + (((tickAnim - 23) / 2) * (10.25-(46.13)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 10.25 + (((tickAnim - 25) / 2) * (18-(10.25)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfrontfoot, leftfrontfoot.rotateAngleX + (float) Math.toRadians(xx), leftfrontfoot.rotateAngleY + (float) Math.toRadians(yy), leftfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -0.975 + (((tickAnim - 0) / 18) * (-0.4-(-0.975)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -0.4 + (((tickAnim - 18) / 5) * (-0.015-(-0.4)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -0.015 + (((tickAnim - 23) / 2) * (-1.265-(-0.015)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = -1.265 + (((tickAnim - 25) / 2) * (-0.975-(-1.265)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
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
            xx = 11.5 + (((tickAnim - 0) / 6) * (-6.00726-(11.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (2.49621-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.1849-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -6.00726 + (((tickAnim - 6) / 2) * (-13.5-(-6.00726)));
            yy = 2.49621 + (((tickAnim - 6) / 2) * (0-(2.49621)));
            zz = -0.1849 + (((tickAnim - 6) / 2) * (0-(-0.1849)));
        }
        else if (tickAnim >= 8 && tickAnim < 27) {
            xx = -13.5 + (((tickAnim - 8) / 19) * (11.5-(-13.5)));
            yy = 0 + (((tickAnim - 8) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 21.5 + (((tickAnim - 0) / 2) * (30.65-(21.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 30.65 + (((tickAnim - 2) / 4) * (-7.88-(30.65)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -7.88 + (((tickAnim - 6) / 2) * (4.75-(-7.88)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 27) {
            xx = 4.75 + (((tickAnim - 8) / 19) * (21.5-(4.75)));
            yy = 0 + (((tickAnim - 8) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 4) * (4.225-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 4.225 + (((tickAnim - 6) / 2) * (-0.5-(4.225)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = -0.5 + (((tickAnim - 8) / 8) * (-0.855-(-0.5)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            yy = -0.855 + (((tickAnim - 16) / 11) * (0-(-0.855)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightshin.rotationPointX = this.rightshin.rotationPointX + (float)(xx);
        this.rightshin.rotationPointY = this.rightshin.rotationPointY - (float)(yy);
        this.rightshin.rotationPointZ = this.rightshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 36.5 + (((tickAnim - 0) / 2) * (43.07-(36.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 43.07 + (((tickAnim - 2) / 4) * (0-(43.07)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (8.5-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 8.5 + (((tickAnim - 8) / 8) * (-10.75-(8.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = -10.75 + (((tickAnim - 16) / 11) * (36.5-(-10.75)));
            yy = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthindfoot, righthindfoot.rotateAngleX + (float) Math.toRadians(xx), righthindfoot.rotateAngleY + (float) Math.toRadians(yy), righthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 6) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-1.15-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = -1.15 + (((tickAnim - 8) / 8) * (-0.445-(-1.15)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            yy = -0.445 + (((tickAnim - 16) / 11) * (-0.4-(-0.445)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthindfoot.rotationPointX = this.righthindfoot.rotationPointX + (float)(xx);
        this.righthindfoot.rotationPointY = this.righthindfoot.rotationPointY - (float)(yy);
        this.righthindfoot.rotationPointZ = this.righthindfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -6.25 + (((tickAnim - 0) / 13) * (11.5-(-6.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 11.5 + (((tickAnim - 13) / 5) * (-5.17037-(11.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (-0.9986-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0.10604-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5.17037 + (((tickAnim - 18) / 2) * (-13.5-(-5.17037)));
            yy = -0.9986 + (((tickAnim - 18) / 2) * (0-(-0.9986)));
            zz = 0.10604 + (((tickAnim - 18) / 2) * (0-(0.10604)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -13.5 + (((tickAnim - 20) / 7) * (-6.25-(-13.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 11.75 + (((tickAnim - 0) / 13) * (21.5-(11.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 21.5 + (((tickAnim - 13) / 1) * (28.03-(21.5)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 28.03 + (((tickAnim - 14) / 4) * (1.48-(28.03)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 1.48 + (((tickAnim - 18) / 2) * (4.75-(1.48)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 4.75 + (((tickAnim - 20) / 7) * (11.75-(4.75)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 13) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (2.42-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.925-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 2.42 + (((tickAnim - 18) / 2) * (-0.5-(2.42)));
            zz = -0.925 + (((tickAnim - 18) / 2) * (0-(-0.925)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = -0.5 + (((tickAnim - 20) / 7) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftshin.rotationPointX = this.leftshin.rotationPointX + (float)(xx);
        this.leftshin.rotationPointY = this.leftshin.rotationPointY - (float)(yy);
        this.leftshin.rotationPointZ = this.leftshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -6 + (((tickAnim - 0) / 13) * (36.5-(-6)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 36.5 + (((tickAnim - 13) / 1) * (42.53-(36.5)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 42.53 + (((tickAnim - 14) / 4) * (-6.75-(42.53)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -6.75 + (((tickAnim - 18) / 2) * (8.5-(-6.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 8.5 + (((tickAnim - 20) / 7) * (-6-(8.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthindfoot, lefthindfoot.rotateAngleX + (float) Math.toRadians(xx), lefthindfoot.rotateAngleY + (float) Math.toRadians(yy), lefthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -1.15 + (((tickAnim - 0) / 13) * (-0.4-(-1.15)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.4 + (((tickAnim - 13) / 7) * (-1.15-(-0.4)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = -1.15 + (((tickAnim - 20) / 7) * (-1.15-(-1.15)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthindfoot.rotationPointX = this.lefthindfoot.rotationPointX + (float)(xx);
        this.lefthindfoot.rotationPointY = this.lefthindfoot.rotationPointY - (float)(yy);
        this.lefthindfoot.rotationPointZ = this.lefthindfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.669))*0.55), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665))*1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665+30))*1.8));


        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.669+40))*-0.2), bodymiddle.rotateAngleY + (float) Math.toRadians(0), bodymiddle.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665+150))*2));


        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.669+80))*-0.8), bodyfront.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665))*-1), bodyfront.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665+190))*1.5));


        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.669+80))*0.8), neckbase.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665))*-1), neckbase.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665-280))*1.5));


        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.669+140))*0.8), neckmiddlebase.rotateAngleY + (float) Math.toRadians(0), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665-300))*1.5));


        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.669+190))*-0.8), neckmiddlefront.rotateAngleY + (float) Math.toRadians(0), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665-330))*1.5));


        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.669+250))*-0.8), neckfront.rotateAngleY + (float) Math.toRadians(0), neckfront.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665-380))*1.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.669+280))*-0.8), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665-430))*1.5));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.669))*0.1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665-20))*1), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665+30))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.669))*0.1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665-60))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665+30))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.669))*0.1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665-90))*2.8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665+30))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.669))*0.1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665-130))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665+30))*1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.669))*0.5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665-160))*4), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665+50))*1.5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.669-30))*1), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665-190))*5), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665+70))*1.5));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.669-60))*3), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665-220))*7), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665+120))*1.5));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.669-90))*5), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665-200))*15), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665+150))*1.5));


        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.669-140))*8), tail9.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665-230))*15), tail9.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.665+180))*1.5));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraNigersaurus e = (EntityPrehistoricFloraNigersaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION); //30 ticks
        animator.startKeyframe(8);
        animator.rotate(this.head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjawbase, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(12);
        animator.resetKeyframe(10);

    }
}
